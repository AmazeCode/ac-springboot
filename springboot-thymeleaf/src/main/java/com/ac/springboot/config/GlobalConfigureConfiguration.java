package com.ac.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 全局配置类
 * @author: zhangyadong
 * @Date: 2019/11/20 0020 下午 2:35
 * @version: V1.0
 */
@Configuration
public class GlobalConfigureConfiguration implements WebMvcConfigurer {

    /**
     * @Description 静态资源处理器
     * @params [registry]
     * @return void
     * @author zhangyadong
     * @date 2019/11/20 0020 下午 2:42
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //静态资源目录文件目录
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
