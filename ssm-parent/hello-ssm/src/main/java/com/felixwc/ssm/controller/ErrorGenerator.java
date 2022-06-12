package com.felixwc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * in order to learn java!
 * created at 2021/8/17 17:46
 *
 * @author wangchao
 */
@RequestMapping("/error")
@Controller
public class ErrorGenerator {

    // /error/null
    @GetMapping("/null")
    @ResponseBody
    public String generateNullException(){
        Object o = new Object();
        o=null;
        o.toString();
        return "Can not generate null pointer exception";
    }

}
