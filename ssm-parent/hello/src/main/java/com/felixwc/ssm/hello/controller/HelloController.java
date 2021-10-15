package com.felixwc.ssm.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2021/10/15 22:22
 *
 * @author wangchao
 */
@RestController
public class HelloController {
    @GetMapping("/hi")
    public String getHello(){
        return "hello";
    }

}
