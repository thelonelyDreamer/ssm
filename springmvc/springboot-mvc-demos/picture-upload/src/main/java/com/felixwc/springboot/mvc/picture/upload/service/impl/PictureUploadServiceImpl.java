package com.felixwc.springboot.mvc.picture.upload.service.impl;

import com.felixwc.springboot.mvc.picture.upload.pojo.vo.ImageVo;
import com.felixwc.springboot.mvc.picture.upload.service.PictureUploadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * in order to learn java!
 * created at 2022/3/2 06:15
 *
 * @author wangchao
 */
@Service
@ConfigurationProperties(prefix = "images")
public class PictureUploadServiceImpl implements PictureUploadService {
    // 由于属性的值后期可能会发生变化,所以应该动态的获取属性数据. 利用pro配置文件
    @Value("${image.realDirPath}")
    private String realDirPath;
    //1.2 准备图片的集合  包含了所有的图片类型.
    private static Set<String> imageTypeSet;
    static {
        imageTypeSet = new HashSet<>();
        imageTypeSet.add(".jpg");
        imageTypeSet.add(".png");
        imageTypeSet.add(".gif");
    }

    @Override
    public ImageVo upload(MultipartFile file) {
        // 1. 整理路径，防止有空白字符
        realDirPath.trim();

        // 2. 校验图片类型
        String originalFilename = file.getOriginalFilename();
        int index = originalFilename.lastIndexOf(".");
        String fileType = originalFilename.substring(index).toLowerCase();
        if(!imageTypeSet.contains(fileType)){
            return  ImageVo.fileTypeNotSupport();
        }

        //2.校验是否为恶意程序 根据宽度/高度进行判断
        try {
            //2.1 利用工具API对象 读取字节信息.获取图片对象类型
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            //2.2 校验是否有宽度和高度
            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            if(width==0 || height==0){
                return ImageVo.fileTypeNotSupport();
            }

            //3.分目录存储  yyyy/MM/dd 分隔
            //3.1 将时间按照指定的格式要求 转化为字符串.
            String dateDir = new SimpleDateFormat("/yyyy/MM/dd/")
                    .format(new Date());
            //3.2 拼接文件存储的目录对象
            String fileDirPath = realDirPath + dateDir;
            File dirFile = new File(fileDirPath);
            //3.3 动态创建目录
            if(!dirFile.exists()){
                dirFile.mkdirs();
            }

            //4.防止文件重名  uuid.jpg 动态拼接
            //4.1 动态生成uuid  实现文件名称拼接  名.后缀
            String uuid =
                    UUID.randomUUID().toString().replace("-", "");
            String realFileName = uuid + fileType;

            //5 实现文件上传
            //5.1 拼接文件真实路径 dir/文件名称.
            String realFilePath = fileDirPath + realFileName;
            //5.2 封装对象  实现上传
            File realFile = new File(realFilePath);
            file.transferTo(realFile);

            //实现文件上传成功!!! http://image.jt.com\2020\09\30\a.jpg
            String url ="/picture"+ dateDir + realFileName;
            return ImageVo.success(url);
        } catch (IOException e) {
            e.printStackTrace();
            return ImageVo.fileTypeNotSupport();
        }
    }
}
