package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/4/21 13:48
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("test1")
    public String test1(Integer id, String name, Boolean gender, Date bitrh) {
        return id.toString()+name+gender+bitrh;
    }
}
