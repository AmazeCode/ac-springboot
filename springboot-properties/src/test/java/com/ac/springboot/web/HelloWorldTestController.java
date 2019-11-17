package com.ac.springboot.web;

import com.ac.springboot.properties.HomeAnnotationProperties;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  @Description: HelloWorldController测试(该形式不需要配置启动类,但是采用注入的形式拿不到properties中的内容)
 *  @author: zhangyadong
 *  @Date: 2019/11/15 11:14
 *  @version: V1.0
 */
public class HelloWorldTestController {

    @Test
    public void testSayHello() {
        //assertEquals测试输入如果两者一直程序运行，不一致程序抛出异常
        assertEquals("Hello,World!",new PropertiesController().sayHello());
    }

    @Test
    public void testHome(){
        assertEquals("Test Home!",new PropertiesController().testHomeProty());
    }
}