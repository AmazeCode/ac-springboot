package com.ac.springboot.controller;

import com.ac.springboot.model.User;
import com.ac.springboot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 *  @Description: 用户控制层
 *  @author: zhangyadong
 *  @Date: 2019/11/23 13:25
 *  @version: V1.0
 */
@RestController
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/getUser")
    public User getUser(){
        //初始化用户
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
        redisUtil.sSet("user",user);
        return user;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session){

        //获取uid
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {//为空生成uuid
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
