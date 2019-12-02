package com.ac.springboot.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description: Spring 上下文类
 * @author: zhangyadong
 * @Date: 2019/11/26 0026 下午 9:17
 * @version: V1.0
 */
@Component
public class SpringContextHolder implements ApplicationContextAware {

    /**
     * @Description spring上下文
     * @params
     * @return
     * @author zhangyadong
     * @date 2019/12/1 0001 下午 8:25
     */
    private static ApplicationContext appContext = null;

    /**
     * @Description 通过name获取Bean
     * @params [name]
     * @return java.lang.Object
     * @author zhangyadong
     * @date 2019/11/26 0026 下午 9:20
     */
    public static Object getBean(String name){
        return appContext.getBean(name);
    }

    /**
     * @Description 通过class获取Bean
     * @params [clazz]
     * @return T
     * @author zhangyadong
     * @date 2019/11/26 0026 下午 9:22
     */
    public static <T> T getBean(Class<T> clazz){
        return appContext.getBean(clazz);
    }

    /**
     * @Description 通过name以及clazz返回指定的Bean
     * @params [name, clazz]
     * @return T
     * @author zhangyadong
     * @date 2019/11/26 0026 下午 9:25
     */
    public static <T> T getBean(String name,Class<T> clazz){
        return appContext.getBean(name,clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(appContext == null){
            appContext = applicationContext;
        }
    }
}
