package com.stev.securingweb;

import org.springframework.context.annotation.configuration;
import org.springframework.web.servlet.config.annotation.ViewControlRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig
implements WebMvcConfigurer{
    public void addViewController(ViewControlRegistry registry){
        registry.addViewController("/home").setViewName(”home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }
}
