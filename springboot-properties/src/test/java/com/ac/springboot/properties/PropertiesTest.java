package com.ac.springboot.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 *  @Description: 配置文件读取测试
 *  @author: zhangyadong
 *  @Date: 2019/11/15 11:17
 *  @version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesTest.class);

    /**
     * 方式一
     * 采用@Value(${home.city})形式
     */
    @Autowired
    private HomeAnnotationProperties homeAnnotationProperties;

    /**
     * 方式二
     * 使用Environment获取配置信息
     */
    @Autowired
    private HomeEnvironmentProperties homeEnvironmentProperties;

    /**
     * 方式三
     * @Description 配置类的形式(包括实体嵌套)
     * @author zhangyadong
     * @date 2019/11/15 14:16
     */
    @Autowired
    private HomeProperties homeProperties;

    @Test
    public void getHomeAnnotationProperties(){
        LOGGER.info("\n\n" + homeAnnotationProperties.toString() + "\n");
    }

    @Test
    public void getHomeEnvironmentProperties(){
        LOGGER.info("\n\n" + homeEnvironmentProperties.toString() + "\n");
    }

    @Test
    public void getHomeProperties() {
        LOGGER.info("\n\n" + homeProperties.toString() + "\n");
    }
}
