package com.ac.springboot.config;

import com.ac.springboot.listener.ServletListener2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *  @Description: 过配置类
 *  @author: zhangyadong
 *  @Date: 2019/11/21 17:42
 *  @version: V1.0
 */
@Configuration
public class MyConfigure {

    /**
     * 注入自定义过滤器
     */
    @Autowired
    private MyFilter myFilter;

    /**
     * 配置过滤器url以及过滤器名,执行顺序(配置类过滤器执行优先级高于@WebFilter注解配置的过滤器)
     * @return
     */
    @Bean
    public FilterRegistrationBean ServletLoginFilterFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(myFilter);
        //设置过滤规则
        registration.addUrlPatterns("/servlet/filter1");
        //设置init参数
        registration.addInitParameter("paramName", "paramValue");
        //设置过滤器名称
        registration.setName("MyFilter");
        //设置执行顺序
        registration.setOrder(3);
        return registration;
        //如果有多个Filter，再写一个public FilterRegistrationBean registerOtherFilter(){...}即可.同时写一个新的过滤器类如:MyFilter
    }

    /**
     * @Description 手动配置监听器(配置类监听器执行优先级高于@WebListener注解配置的监听器)
     * @params []
     * @return org.springframework.boot.web.servlet.ServletListenerRegistrationBean<com.ac.springboot.listener.ServletListener2>
     * @author zhangyadong
     * @date 2019/11/21 18:26
     */
    @Bean
    public ServletListenerRegistrationBean<ServletListener2> servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<ServletListener2> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        //配置监听器
        servletListenerRegistrationBean.setListener(new ServletListener2());
        //servletListenerRegistrationBean.setOrder(1);配置执行顺序
        return servletListenerRegistrationBean;
    }
}
