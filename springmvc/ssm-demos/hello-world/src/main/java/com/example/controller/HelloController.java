package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * in order to learn java!
 * created at 2022/4/19 23:51
 *
 * @author felixwc
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String test1(){
        return "index";
    }

    @RequestMapping("/target")
    public String test2(){
        return "target";
    }
}
