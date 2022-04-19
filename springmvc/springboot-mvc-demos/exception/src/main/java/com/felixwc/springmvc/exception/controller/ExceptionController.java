package com.felixwc.springmvc.exception.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/29 22:08
 *
 * @author wangchao
 */
@RestController
@Log
@RequestMapping("/ex")
public class ExceptionController {
    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

    @GetMapping("/test1")
    public String test1() throws IllegalAccessException {
        throw new IllegalAccessException("test");
    }
    @ExceptionHandler(RuntimeException.class)
    public String test(RuntimeException e){
        log.info(e.getMessage());
        return e.getMessage();
    }
}
