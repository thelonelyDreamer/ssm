package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * in order to learn java!
 * created at 2022/4/21 15:42
 *
 * @author felixwc
 */
@RequestMapping("/request")
@RestController
public class RequestController {
    @Autowired
    private HttpServletRequest request;
    @GetMapping("/test")
    private String test(){
        ServletContext servlet = request.getServletContext();
        return null;
    }
}
