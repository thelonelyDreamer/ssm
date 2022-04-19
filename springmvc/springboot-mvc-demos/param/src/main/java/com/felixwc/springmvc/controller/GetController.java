package com.felixwc.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/3/29 19:16
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/get")
public class GetController {

    @GetMapping("/name")
    public String byParamName(@RequestParam("name") String name){
        return name;
    }
}
