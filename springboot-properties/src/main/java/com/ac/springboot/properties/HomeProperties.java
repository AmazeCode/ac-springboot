package com.ac.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *  @Description: 家乡配置类(读取配置文件方法一)方式三
 *  应用场景：适合于配置比较多，希望更好的组织
 *  @author: zhangyadong
 *  @Date: 2019/11/15 10:52
 *  @version: V1.0
 */
@Component//声明为组件
@ConfigurationProperties(prefix="ac")//标记配置类,匹配配置类前缀为home的内容
@PropertySource("classpath:application.properties")//(1.5版本之后的写法)配置文件地址,不写默认在application.properties下查找
//@ConfigurationProperties(locations = "classpath:custom.properties", prefix = "c")//1.5版本之前指定文件位置的写法
public class HomeProperties {

    /**
     * 配置文件嵌套属性映射
     */
    @NestedConfigurationProperty
    private Home home;

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public static class Home{

        /**
         * 省份
         */
        private String province;

        /**
         * 城市
         */
        private String city;

        /**
         * 描述
         */
        private String desc;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    @Override
    public String toString() {
        return "HomeProperties{" +
                "province='" + home.getProvince() + '\'' +
                ", city='" + home.getCity() + '\'' +
                ", desc='" + home.getDesc() + '\'' +
                '}';
    }
}
