package com.felixwc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * in order to learn java!
 * created at 2022/4/20 16:29
 *
 * @author felixwc
 */
@Configuration
public class CustomerMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/test").setViewName("test");
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        CustomerMvcConfig config = new CustomerMvcConfig();
        return config;
    }
}
