package com.felixwc.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * in order to learn java!
 * created at 2021/12/12 12:56
 *
 * @author wangchao
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
