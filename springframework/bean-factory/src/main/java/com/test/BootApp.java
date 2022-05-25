package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * in order to learn java!
 * created at 2022/4/20 17:26
 *
 * @author felixwc
 */
@ComponentScan("com.test")
public class BootApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BootApp.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
