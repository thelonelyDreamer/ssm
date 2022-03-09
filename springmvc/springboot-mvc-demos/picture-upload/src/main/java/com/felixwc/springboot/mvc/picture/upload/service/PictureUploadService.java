package com.felixwc.springboot.mvc.picture.upload.service;

import com.felixwc.springboot.mvc.picture.upload.pojo.vo.ImageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * in order to learn java!
 * created at 2022/3/2 06:14
 *
 * @author wangchao
 */
public interface PictureUploadService {
    ImageVo upload(MultipartFile file);
}
