package com.felixwc.ssm.mvc.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author lenovo
 * since 2020-10-13  09:41
 */

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test1")
    public String hello1(){
        System.out.println("hello1");
        return "hello1";
    }
    @RequestMapping("/test2")
    public String hello2(){
        System.out.println("hello2");
        return null;
    }

}
