package com.felixwc.ssm.exception.mvchandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * in order to learn java!
 * created at 2021/8/17 17:37
 *
 * @author wangchao
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public String nullHandler(){
        return "/null-pointer";
    }
}
