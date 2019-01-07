package com.example.configurations;

import com.example.filters.TransactionalFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    /*This configuration class is used to configure filters to be enabled for
    * some filters and disable for other filters.
    * */

    @Bean
    public FilterRegistrationBean<TransactionalFilter> loggingFilter(){
        FilterRegistrationBean<TransactionalFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new TransactionalFilter());
        registrationBean.addUrlPatterns("/*");

        return registrationBean;
    }

}
