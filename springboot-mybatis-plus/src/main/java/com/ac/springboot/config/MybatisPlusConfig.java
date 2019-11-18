package com.ac.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * @Description: MybatisPlus 配置类
 * @author: zhangyadong
 * @Date: 2019/11/18 0018 下午 4:43
 * @version: V1.0
 */
@Component
@MapperScan("com.ac.springboot.dao")
public class MybatisPlusConfig {
}
