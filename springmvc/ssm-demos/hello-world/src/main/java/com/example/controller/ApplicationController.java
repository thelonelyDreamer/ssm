package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * in order to learn java!
 * created at 2022/4/21 16:17
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/application")
public class ApplicationController {
    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        String test1Name = (String) request.getServletContext().getAttribute("test1Name");
        return test1Name;
    }

    @RequestMapping("/test1")
    public String test1(HttpServletRequest request){
        ServletContext context = request.getServletContext();
        context.setAttribute("test1Name","test1Value");
        return null;
    }
}
