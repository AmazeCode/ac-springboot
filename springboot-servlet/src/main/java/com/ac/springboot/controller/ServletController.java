package com.ac.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 *  @Description: 接口层
 *  @author: zhangyadong
 *  @Date: 2019/11/21 16:16
 *  @version: V1.0
 */
@RestController
@RequestMapping("/servlet")
public class ServletController {

    @RequestMapping("/index")
    public Object index() {
        return new Date() + " - index";
    }

    @RequestMapping("/filter1")
    public Object filter1() {
        return new Date() + " - filter1";
    }

    @RequestMapping("/filter2")
    public Object filter2() {
        return new Date() + " - filter2";
    }
}
