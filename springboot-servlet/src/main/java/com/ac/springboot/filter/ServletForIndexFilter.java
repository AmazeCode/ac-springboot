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
 *  @Description: 过滤指定请求(注解过滤器方法一)
 *  @author: zhangyadong
 *  @Date: 2019/11/21 16:05
 *  @version: V1.0
 */
@WebFilter(filterName = "servletForIndexFilter",urlPatterns = { "/servlet/index" })//过滤index请求
@Order(2)
public class ServletForIndexFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(ServletForIndexFilter.class);

    @Override
    public void destroy() {
        logger.info("WebAppForIndexFilter - SpringBean注册的过滤器已销毁...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        logger.info("ServletForIndexFilter - Request URL: {}", request.getRequestURL().toString());
        logger.info("ServletForIndexFilter - Request port：{}", request.getServerPort());
        logger.info("ServletForIndexFilter - Request Method: {}", request.getMethod());

        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Current-Path", request.getServletPath());
        response.setHeader("My-Name", "詹姆斯");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        logger.info("ServletForIndexFilter - {}初始化SpringBean注册的过滤器...", new Date());
    }
}
