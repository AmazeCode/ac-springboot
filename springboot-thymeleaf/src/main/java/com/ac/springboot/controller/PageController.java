package com.ac.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 页面跳转Controler
 * @author: zhangyadong
 * @Date: 2019/11/21 0021 下午 9:17
 * @version: V1.0
 */
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * @Description 加载模板页面
     * @params []
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/22 16:03
     */
    @RequestMapping("/layout")
    public String index(){
        return "page/layout";
    }

    /**
     * @Description 用户列表
     * @params []
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/22 16:04
     */
    @RequestMapping("/list")
    public String userList(Model model){
        List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
        Map<String, Object> user = new HashMap<String, Object>(){{
            put("sid", "101");
            put("sname", "张三");
            put("sage", "20");
            put("scourse", new HashMap<String, String>(){{
                put("cname", "语文,数学,英语");
                put("cscore", "93,95,98");
            }});
        }};
        resultList.add(user);
        user = new HashMap<String, Object>(){{
            put("sid", "102");
            put("sname", "李四");
            put("sage", "30");
            put("scourse", new HashMap<String, String>(){{
                put("cname", "物理,化学,生物");
                put("cscore", "92,93,97");
            }});
        }};
        resultList.add(user);
        model.addAttribute("resultList", resultList);
        return "page/userList";
    }
}
