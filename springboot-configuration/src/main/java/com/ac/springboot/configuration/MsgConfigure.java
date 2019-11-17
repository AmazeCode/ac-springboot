package com.ac.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @Description: TODO
 *  @author: zhangyadong
 *  @Date: 2019/11/15 15:52
 *  @version: V1.0
 */
@Configuration //配置类
public class MsgConfigure {

    /**
     * 注册容器
     */
    @Bean
    public String msg(){
        return "msg configure";
    }
}
