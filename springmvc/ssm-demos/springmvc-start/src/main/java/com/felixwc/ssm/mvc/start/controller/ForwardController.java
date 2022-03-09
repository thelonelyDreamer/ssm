package com.felixwc.ssm.mvc.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 * 转发
 * @author lenovo
 * since 2020-10-13  14:01
 */

@Controller
@RequestMapping("jump")
public class ForwardController {

    @RequestMapping("test1")
    public String test1(){
        System.out.println("test1");
        // 通过视图解析器进行拼接
        return  "index";
        // 通过绝对路径
//        return "forward:/hello.jsp";
    }

    // http://localhost:8080/HellOSPringMVC_war/jump/test2
    @RequestMapping("test2")
    public  String test2(){
//        return "forward：test";
        return "forward:/jump/test1";
    }

    @RequestMapping("test3")
    public String test3(){
        System.out.println("test3");
        return "redirect:/JSP/index.jsp";
    }

    @RequestMapping("test4")
    public String test4(){
        System.out.println("test4");
        return "redirect:test3";
        //return "redirect:/jump/test3"
    }

    //什么时候选择跳转，什么时候重定向
    // 增删改后应该重定向
    // 查询 应该用转发
}
