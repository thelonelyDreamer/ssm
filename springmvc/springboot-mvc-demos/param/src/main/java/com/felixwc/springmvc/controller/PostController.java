package com.felixwc.springmvc.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * in order to learn java!
 * created at 2022/3/29 20:30
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @PostMapping("/test")
    public String test(@RequestBody MyObject myObject){
        return myObject.toString();
    }

    @PostMapping("/test2")
    public String test(@RequestBody Map<String,String> map){
        return map.get("name");
    }

    @Data
    private static class MyObject{
        private String name;
        private int age;
    }
}
