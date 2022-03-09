package com.felixwc.ssm.mvc.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * TODO
 *
 * @author lenovo
 * since 2020-10-13  14:36
 */

@Controller
@RequestMapping("/data")
@SessionAttributes(names = {"city", "street"})
public class DataController {

    @RequestMapping("/test1")
    public String test1(HttpServletRequest httpServletRequest, HttpSession httpSession) {
        System.out.println("" +
                "test1");
        httpServletRequest.setAttribute("name", "张三");
        httpSession.setAttribute("age", 18);
        return "data";
    }

    @RequestMapping("test2")
    public String test2(Model model) {
        model.addAttribute("gender", true);
        model.addAttribute("city", "beijing");
        model.addAttribute("street", "长安街");
        return "data2";
    }

    @RequestMapping("test3")
    public String test3(SessionStatus status) {
        //清空所有通过modle 存入的数据
        status.setComplete();
        return "data2";
    }

    @RequestMapping("test4")
    public ModelAndView test4(@PathVariable("username") String name) {
        ModelAndView modelAndView = new ModelAndView();
        // 必须写绝对路径
        modelAndView.setViewName("forward:/JSP/data1.jsp");
        modelAndView.addObject("number", 1);
        return modelAndView;
    }


}
