package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * in order to learn java!
 * created at 2022/4/21 14:55
 *
 * @author felixwc
 */
@RestController
@SessionAttributes({"name","age"})
@RequestMapping("/session")
public class SessionController {

    @RequestMapping("/test1")
    public String test1(Model model){
        return null;
    }
}
