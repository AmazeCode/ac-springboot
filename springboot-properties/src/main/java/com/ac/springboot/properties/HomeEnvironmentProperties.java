package com.ac.springboot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 *  @Description: Environment读取配置文件(方式二)
 *  @author: zhangyadong
 *  @Date: 2019/11/15 15:16
 *  @version: V1.0
 */
@Configuration
@PropertySource("classpath:application.properties")//1.5版本之后指定文件路径的方式
//@ConfigurationProperties(locations = "classpath:custom.properties", prefix = "c")//1.5版本之前指定文件位置的写法
public class HomeEnvironmentProperties {

    @Autowired
    Environment environment;

    /**
     * 省
     */
    public String getProvince(){
        return environment.getProperty("home.province");
    }

    /**
     * 城市
     */
    public String getCity(){
        return environment.getProperty("home.city");
    }

    /**
     * 描述
     */
    public String getDesc(){
        return environment.getProperty("home.desc");
    }

    @Override
    public String toString() {
        return "HomeEnvironmentProperties{" +
                "province='" + getProvince() + '\'' +
                ", city='" + getCity() + '\'' +
                ", desc='" + getDesc() + '\'' +
                '}';
    }
}
