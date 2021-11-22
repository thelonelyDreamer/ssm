package com.felixwc.spring.context;

import com.felixwc.spring.context.config.ContextConfig;
import com.felixwc.spring.context.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * in order to learn java!
 * created at 2021/11/22 14:41
 *
 * @author wangchao
 */

public class BootSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
        String[] beans = context.getBeanDefinitionNames();
        UserService bean1 = context.getBean(UserService.class);
        bean1.test();
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
