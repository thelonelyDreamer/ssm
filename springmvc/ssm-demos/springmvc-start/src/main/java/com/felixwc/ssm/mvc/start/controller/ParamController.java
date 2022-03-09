package com.felixwc.ssm.mvc.start.controller;

import com.felixwc.ssm.mvc.start.entity.User;
import com.felixwc.ssm.mvc.start.entity.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * TODO
 * receive parammeter
 *
 * @author lenovo
 * since 2020-10-13  10:57
 */

@Controller
@RequestMapping("param")
public class ParamController {

    // http://xxxx/param/test1?id=1&name=sea&gender=true&birth=2020/12/12 12:12:00
    // Springmvc默认日期类型 2020/12/12 12:12:00
    @RequestMapping("test1")
    public String test1(Integer id, String name, Boolean gender, Date birth){
        System.out.println(id);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(birth);
        System.out.println("Parameters received successfully ");
        return "index";
    }

    // http://localhost:8080/HellOSPringMVC_war/param/test2?id=1&name=sea&gender=true&birth=2020/12/12 12:12:00
    @RequestMapping("test2")
    public String test2(User user){
        System.out.println(user);
        return "index";
    }

    //http://localhost:8080/HellOSPringMVC_war/param/test3?hobby=basketball&hobby=football&hobby=volleyball
    @RequestMapping("test3")
    public String test3(String[] hobby){
        System.out.println(hobby);
        return "param";
    }

    @RequestMapping("test4")
    public String test4(User user){
        System.out.println(user);
        return "param1";
    }

    //[] 在url中会报错
    // 采用类型
    @RequestMapping("test5")
    public String test5(UserList users){
        System.out.println(users);
        return "param2";
    }

    //{id} 命名路径
    // {id} 等价于/* /test/1 /test/2 /test/xxxx （整数）
    @RequestMapping("test6/{id}")
    public  String test6(@PathVariable("id") Integer id){
        System.out.println(id);
        return null;
    }

    @RequestMapping("test7/{id}/{name}")
    public  String test7(@PathVariable Integer id,@PathVariable("name")String name2){
        System.out.println(id);
        System.out.println(name2);
        return null;
    }

    // 乱码位置
/*
* http <meta charset="UTF-8">
    JSP <%@ page contentType="text/html;charset=UTF-8" language="java" %>
*
* */
}
