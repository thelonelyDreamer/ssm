package com.felixwc.springmvc.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * in order to learn java!
 * created at 2022/3/29 19:16
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping("/test")
    public String test(@CookieValue("name") String name,@CookieValue("password") String password){
        System.out.println("name"+name);
        System.out.println("password"+password);
        return name+":"+password;
    }

    @GetMapping("/login")
    public void login(@RequestParam("name") String name,
                      @RequestParam("password") String password, HttpServletResponse httpServletResponse){
       httpServletResponse.addCookie(new Cookie("name",name));
       httpServletResponse.addCookie(new Cookie("password",password));
    }

}
