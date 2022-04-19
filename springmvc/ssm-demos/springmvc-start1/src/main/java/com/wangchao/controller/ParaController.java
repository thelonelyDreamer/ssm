package com.wangchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.SoundbankResource;
import java.util.Date;

/**
 * TODO
 * 收参
 *
 * @author lenovo
 * since 2020-08-02  12:47
 */

@Controller
@RequestMapping("/param")
public class ParaController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("hello");
        return "index";
    }

    //http://xxx/param/test1?id=1&name=maven&gender=true&birth=2020/08/02
    @RequestMapping("/test1")
    public String test1(Integer id, String name, Boolean gender, Date birth){
        System.out.println("test1");
        return "index";
    }

}
