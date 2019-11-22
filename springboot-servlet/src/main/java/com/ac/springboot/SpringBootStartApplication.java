package com.ac.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 *  @Description: SpringBoot启动类
 *  @author: zhangyadong
 *  @Date: 2019/11/21 16:02
 *  @version: V1.0
 */
@SpringBootApplication
@ServletComponentScan//扫描过滤器文件,可以不配置包路径,扫描所有
public class SpringBootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartApplication.class,args);
    }
}
