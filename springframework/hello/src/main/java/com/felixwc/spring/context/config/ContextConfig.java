package com.felixwc.spring.context.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * in order to learn java!
 * created at 2021/11/22 15:23
 *
 * @author wangchao
 */
@ComponentScan("com.felixwc.spring.context")
@EnableAspectJAutoProxy
@EnableAsync
public class ContextConfig {
}
