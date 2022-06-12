package com.felixwc.mybatis22.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * in order to learn java!
 * created at 2021/8/19 18:50
 *
 * @author wangchao
 */
@Controller
@Slf4j
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        log.warn("warn");
        return "hello";
    }
}
