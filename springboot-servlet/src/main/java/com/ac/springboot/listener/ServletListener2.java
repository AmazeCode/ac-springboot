package com.ac.springboot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 *  @Description: 监听器实例2
 *  @author: zhangyadong
 *  @Date: 2019/11/21 18:16
 *  @version: V1.0
 */
public class ServletListener2 implements ServletContextListener {

    private static Logger logger = LoggerFactory.getLogger(ServletListener2.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("ServletListener2----------开始初始化获取实列:"+sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("ServletListener2----------已经销毁实列:"+sce.getServletContext());
    }
}
