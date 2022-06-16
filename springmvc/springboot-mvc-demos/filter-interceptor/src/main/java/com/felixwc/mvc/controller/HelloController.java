package com.felixwc.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/6/15 17:52
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/delay")
    public String delay() throws InterruptedException {
        Thread.sleep(3000);
        return "delay";
    }
}
