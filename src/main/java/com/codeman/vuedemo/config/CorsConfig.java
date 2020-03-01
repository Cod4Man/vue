package com.codeman.vuedemo.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author: zhanghongjie
 * @description:
 * @date: 2020/2/6 0:18
 * @version: 1.0
 */
public class CorsConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        System.out.println("----------------------");
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("mytoken")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }
}