package com.felixwc.springboot.mvc.picture.upload.pojo.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2022/3/2 06:11
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class ImageVo {
    private boolean result;
    private String message;
    private String path;

    public static ImageVo fileTypeNotSupport(){
        return new ImageVo().setResult(false).setMessage("Not Support this Type");
    }
    public static ImageVo success(String path){
        return new ImageVo().setResult(true).setPath(path);
    }
}
