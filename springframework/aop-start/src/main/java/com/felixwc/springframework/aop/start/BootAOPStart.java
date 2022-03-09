package com.felixwc.springframework.aop.start;

import com.felixwc.springframework.aop.start.component.MyComponent;
import com.felixwc.springframework.aop.start.config.GlobalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * in order to learn java!
 * created at 2022/2/28 04:12
 *
 * @author wangchao
 */
public class BootAOPStart {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GlobalConfig.class);
        MyComponent bean = context.getBean(MyComponent.class);
        bean.test();
        System.out.println(bean);
    }
}
