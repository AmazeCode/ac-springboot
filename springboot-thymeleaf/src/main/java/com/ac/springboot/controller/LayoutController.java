package com.ac.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: layout使用控制层
 * @author: zhangyadong
 * @Date: 2019/11/20 0020 上午 11:51
 * @version: V1.0
 */
@Controller
public class LayoutController {

    @RequestMapping("/index")
    public String index() {
        return "layout-index";
    }

    /**
     * @Description 子父模板引入插件使用
     * @params []
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/20 0020 下午 5:17
     */
    @RequestMapping("/fragment")
    public String fragment() {

        return "layout-fragment";
    }

    /**
     * @Description 模板整合使用
     * @params []
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/20 0020 下午 5:20
     */
    @RequestMapping("/layout")
    public String layout() {
        return "layout";
    }


    @RequestMapping("/home")
    public String home() {
        return "layout-home";
    }
}
