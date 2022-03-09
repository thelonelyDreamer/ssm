package com.felixwc.springboot.mvc.picture.upload.controller;

import com.felixwc.springboot.mvc.picture.upload.pojo.vo.ImageVo;
import com.felixwc.springboot.mvc.picture.upload.service.PictureUploadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * in order to learn java!
 * created at 2022/3/2 06:03
 *
 * @author wangchao
 */
@Controller
@RequestMapping("/picture")
public class PictureUpLoadController {
    private final PictureUploadService pictureUploadService;

    public PictureUpLoadController(PictureUploadService pictureUploadService) {
        this.pictureUploadService = pictureUploadService;
    }

    @PostMapping("/upload")
    @ResponseBody
    public ImageVo uploadString(@RequestParam("file")MultipartFile picture){
        ImageVo upload = pictureUploadService.upload(picture);
        return upload;
    }
}
