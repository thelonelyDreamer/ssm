package com.felixwc.ssm.mvc.start.controller;

import com.felixwc.ssm.mvc.start.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author lenovo
 * since 2020-10-13  16:43
 */

@Controller
@RequestMapping("/json")
@CrossOrigin("http://127.0.0.1:8848")
//@RestController=@Controller+@ResponseBody
public class JsonController {

    @RequestMapping("/test1")
    @ResponseBody
    public User test1() {
        User user = new User();
        return user;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<User> test2() {
        User user1 = new User();
        User user2 = new User();
        List<User> users = Arrays.asList(user1, user2);
        return users;
    }

    @RequestMapping(value = "/test3", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String test3() {
        return "您好";
    }


    @RequestMapping("/test4")
    @ResponseBody
    public String test4(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }
}
