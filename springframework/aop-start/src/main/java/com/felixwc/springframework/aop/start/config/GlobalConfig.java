package com.felixwc.springframework.aop.start.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * in order to learn java!
 * created at 2022/2/28 04:11
 *
 * @author wangchao
 */
@Configuration
@ComponentScan({"com.felixwc.springframework.aop.start"})
@EnableAspectJAutoProxy
public class GlobalConfig {

}
