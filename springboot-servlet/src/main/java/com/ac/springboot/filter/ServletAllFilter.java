package com.ac.springboot.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 *  @Description: Servlet全局过滤器(过滤所有请求)(注解过滤器方法一)
 *  @author: zhangyadong
 *  @Date: 2019/11/21 16:04
 *  @version: V1.0
 */
@WebFilter(filterName = "servletAllFilter",urlPatterns = {"/*"})//filterName = "servletForIndexFilter",
@Order(1)//定义执行的优先级,数字越低,优先级越高
public class ServletAllFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(ServletAllFilter.class);

    /**
     * @Description 初始化方法
     * @params [filterConfig]
     * @return void
     * @author zhangyadong
     * @date 2019/11/21 16:10
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("ServletAllFilter - {}初始化注解实现的过滤器...", new Date());
    }

    /**
     * @Description 执行过滤
     * @params [servletRequest, servletResponse, filterChain]
     * @return void
     * @author zhangyadong
     * @date 2019/11/21 16:10
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        logger.info("ServletAllFilter - Request URL: {}", request.getRequestURL().toString());
        logger.info("ServletAllFilter - Request port：{}", request.getServerPort());
        logger.info("ServletAllFilter - Request Method: {}", request.getMethod());
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Current-Path", request.getServletPath());
        response.setHeader("My-Name", "库里");
        //执行过滤
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * @Description 销毁方法
     * @params []
     * @return void
     * @author zhangyadong
     * @date 2019/11/21 16:12
     */
    @Override
    public void destroy() {
        logger.info("ServletAllFilter - 注解实现的过滤器已销毁...");
    }
}
