package com.ac.springboot.web;

import com.ac.springboot.properties.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Description: 配置文件使用测试
 *  @author: zhangyadong
 *  @Date: 2019/11/15 11:00
 *  @version: V1.0
 */
@RestController
public class PropertiesController {

    @Autowired
    private HomeProperties homeProperties;

    @RequestMapping("/")
    public String sayHello() {
        System.out.println("******执行正常**********");
        return "Hello,World!";
    }

    @RequestMapping("/testHome")
    public String testHomeProty(){

        return homeProperties.toString();
    }
}
