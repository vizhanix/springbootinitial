package com.example.second.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class StudentHelper {
    
    @Before("execution(public void doFilter())")
    public void exampleAop(){
        System.out.println("AOP successfully executed");
        
    }
}
