package com.felixwc.springmvc.exception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * in order to learn java!
 * created at 2022/3/29 22:00
 *
 * @author wangchao
 */
@ControllerAdvice
public class MyExceptionController {

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleException(IllegalArgumentException e){
        return e.getMessage();
    }
}
