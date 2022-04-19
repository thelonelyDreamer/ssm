package com.felixwc.springmvc.controller;

import org.springframework.web.bind.annotation.*;

/**
 * in order to learn java!
 * created at 2022/3/29 20:57
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/path")
public class PathController {
    @GetMapping("/get/{id}")
    public String test1(@PathVariable String id){
        return id;
    }
}
