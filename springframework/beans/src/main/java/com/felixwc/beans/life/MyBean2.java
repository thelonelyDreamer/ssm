package com.felixwc.beans.life;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;

/**
 * in order to learn java!
 * created at 2022/3/16 19:18
 *
 * @author wangchao
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyBean2 {
    private String name;
    {
        System.out.println("初始代码块");
    }

    @PostConstruct
    public void test1(){
        System.out.println("这是PostConstruct 方法的内容");
    }

    public void init(){
        System.out.println("init 方法");
    }

    public void destroy(){
        System.out.println("destroy 方法");
    }
}
