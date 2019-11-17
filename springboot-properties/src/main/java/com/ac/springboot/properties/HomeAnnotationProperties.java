package com.ac.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 *  @Description: 读取配置文件(方式一)
 *  应用场景：应用灵活,可写独立类，也可直接使用@Value在Controller中使用
 *  @author: zhangyadong
 *  @Date: 2019/11/15 14:16
 *  @version: V1.0
 */
@Component//声明组件(该注解必须)
@PropertySource("classpath:application.properties")//非必须,会找默认位置(1.5版本之后指定配置文件的写法)
//@ConfigurationProperties(locations = "classpath:custom.properties", prefix = "c")//1.5版本之前指定文件位置的写法
public class HomeAnnotationProperties {

    /**
     * 省份
     */
    @Value("${home.province}")
    private String province;

    /**
     * 城市
     */
    @Value("${home.city}")
    private String city;

    /**
     * 描述
     */
    @Value("${home.desc}")
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

    @Override
    public String toString() {
        return "HomeAnnotationProperties{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
