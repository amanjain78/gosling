package com.example.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
@Order(2)
public class TransactionalFilter implements Filter {

    /*
    * */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        log.info("Transaction Begin for request uri {}",httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("Transaction Close for response uri {}",httpServletRequest.getRequestURI());
    }

}
