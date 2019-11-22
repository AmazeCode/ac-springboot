package com.ac.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 *  @Description: 自定义配置过滤器类(配置过滤器方法二)
 *  @author: zhangyadong
 *  @Date: 2019/11/21 17:24
 *  @version: V1.0
 */
@Component
public class MyFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.debug("start to auth request validate...111");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        //业务逻辑处理
        boolean isOk = true;
        if (isOk) {
            logger.info("Hand --------- success");
            //ok放行
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            logger.error("Hand ---------- failed");
        }
    }
}
