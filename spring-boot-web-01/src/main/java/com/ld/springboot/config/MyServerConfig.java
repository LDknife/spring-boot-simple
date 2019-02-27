package com.ld.springboot.config;

import com.ld.springboot.filter.MyFilter;
import com.ld.springboot.listener.MyListener;
import com.ld.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author:ld
 * @create:2018-10-16 15:19
 * @description:
 */
@Configuration
public class MyServerConfig {

    //注册servlet
    @Bean
    public ServletRegistrationBean myServlet(){
        return new ServletRegistrationBean(new MyServlet(),"/myServlet");
    }

    //注册Filter
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter());
        registrationBean.setUrlPatterns(Arrays.asList("/myServlet"));
        return registrationBean;
    }

    //注册Listener
    @Bean
    public ServletListenerRegistrationBean myListener(){
       return new ServletListenerRegistrationBean<MyListener>(new MyListener());
    }
}
