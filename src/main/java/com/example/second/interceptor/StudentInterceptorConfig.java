package com.example.second.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class StudentInterceptorConfig implements WebMvcConfigurer{

    @Autowired
    StudentInterceptor inter;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(inter);
    }
    
}
