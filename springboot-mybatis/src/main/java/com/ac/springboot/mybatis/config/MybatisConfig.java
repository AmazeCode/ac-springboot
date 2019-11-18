package com.ac.springboot.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 *  @Description: Mybatis 配置
 *  @author: zhangyadong
 *  @Date: 2019/11/18 15:24
 *  @version: V1.0
 */
@Component
// mapper 接口类扫描包配置
@MapperScan(value = "com.ac.springboot.mybatis.dao")
public class MybatisConfig {
}
