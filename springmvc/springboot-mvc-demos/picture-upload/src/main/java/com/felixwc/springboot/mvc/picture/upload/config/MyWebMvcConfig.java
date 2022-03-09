package com.felixwc.springboot.mvc.picture.upload.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * in order to learn java!
 * created at 2022/3/2 07:03
 *
 * @author wangchao
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/picture/**")
                .addResourceLocations("file:" + "/common/");
    }
}
