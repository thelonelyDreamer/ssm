package com.felixwc.spring.context.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2021/11/22 17:40
 *
 * @author wangchao
 */
@Aspect
@Component
public class MyAspects {

//    @Before("execution(* *..*.*())")
    public void test(){
        System.out.println("test");
    }
}
