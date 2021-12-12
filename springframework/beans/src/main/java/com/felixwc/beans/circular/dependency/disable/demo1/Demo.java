package com.felixwc.beans.circular.dependency.disable.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2021/12/12 13:15
 *
 * @author wangchao
 */
@ComponentScan("com.felixwc.beans.circular.dependency.disable.demo1")
public class Demo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Demo.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
