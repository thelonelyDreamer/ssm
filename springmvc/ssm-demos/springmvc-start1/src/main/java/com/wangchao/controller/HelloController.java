package com.wangchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 * 后端控制器
 *
 * @author lenovo
 * since 2020-08-02  13:19
 */

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("test1")
    public String hello1(){
        System.out.println("hello1");
        return "index";
    }

    @RequestMapping("test2")
    public String hello2(){
        System.out.println("hello2");
        return null;
    }
}
