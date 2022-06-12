package com.felixwc.ssm.controller;

import com.felixwc.ssm.pojo.data.User;
import com.felixwc.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/17 14:54
 *
 * @author wangchao
 */
@RestController
public class UserController {
    @Autowired
    private UserInfoService service;

    @GetMapping("/users")
    public List<User> getUser(){
        return  service.getAll();
    }
}
