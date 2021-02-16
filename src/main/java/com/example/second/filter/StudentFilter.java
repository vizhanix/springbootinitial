package com.example.second.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class StudentFilter implements Filter {

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        
        System.out.println("This is student filter");
        System.out.println("Local Port: " + sr.getLocalPort());
        System.out.println("Server Name: " + sr.getServerName());
        HttpServletRequest req = (HttpServletRequest) sr;
        System.out.println("Method : " + req.getMethod());
        System.out.println("Request URI: " + req.getRequestURI());

//        String xAuth = req.getHeader("MyKey");
//
//        if (xAuth.equals("Mixon") == false) {
//            throw new ServletException();
//        }

        fc.doFilter(sr, sr1);
    }

}
