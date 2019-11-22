package com.ac.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 *  @Description: 测试类
 *  @author: zhangyadong
 *  @Date: 2019/11/21 16:28
 *  @version: V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ServltControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void webServiceTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/servlet/index"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
