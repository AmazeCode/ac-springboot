package com.ac.springboot.configuration;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 *  @Description: 测试配置类
 *  @author: zhangyadong
 *  @Date: 2019/11/15 16:01
 *  @version: V1.0
 */
public class MsgConfigureTest {

    @Test
    public void testGetMessageBean() throws Exception {

        //使用AnnotationConfigApplicationContext可以实现基于Java的配置类加载Spring的应用上下文。避免使用application.xml进行配置。相比XML配置，更加便捷。
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MsgConfigure.class);
        assertEquals("msg configure", ctx.getBean("msg"));
    }

    @Test
    public void testScanPackages() throws Exception {
        //获取spring上下文应用
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //配置扫描包
        ctx.scan("com.ac.springboot.configuration");
        ctx.refresh();
        //对比通过什么不显示,不通过显示异常
        assertEquals("msg configure", ctx.getBean("msg"));
    }
}
