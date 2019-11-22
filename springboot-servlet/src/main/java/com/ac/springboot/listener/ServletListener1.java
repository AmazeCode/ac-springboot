package com.ac.springboot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *  @Description: 监听器实例1
 *  @author: zhangyadong
 *  @Date: 2019/11/21 18:02
 *  @version: V1.0
 */
@WebListener
public class ServletListener1 implements ServletContextListener {

    private static Logger logger = LoggerFactory.getLogger(ServletListener1.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("ServletListener1-----------------------------------开始初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("ServletListener1-----------------------------------已销毁");
    }
    /**
     * 说明:在过滤器之前执行,可以用于实例初始化
     * 1.启动前环境检测？
     * 2.启动时配置初始化？
     * 3.启动后数据初始化？
     */
}
