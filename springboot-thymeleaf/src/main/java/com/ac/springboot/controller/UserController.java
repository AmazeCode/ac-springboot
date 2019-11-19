package com.ac.springboot.controller;

import com.ac.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用户控制层
 * @author: zhangyadong
 * @Date: 2019/11/19 0019 下午 5:35
 * @version: V1.0
 */
@Controller
public class UserController {

    /**
     * @Description th:text使用
     * @params [map]
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 8:45
     */
    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "AmazeCode");
        return "string";
    }

    /**
     * @Description th:if使用
     * @params [map]
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 8:52
     */
    @RequestMapping("/if")
    public String ifunless(ModelMap map) {
        map.addAttribute("flag", "yes");
        return "if";
    }

    /**
     * @Description th:list 使用
     * @params [map]
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 9:04
     */
    @RequestMapping("/list")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "list";
    }

    /**
     * @Description th:href 使用 th:style使用
     * @params [map]
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 9:10
     */
    @RequestMapping("/url")
    public String url(ModelMap map) {
        map.addAttribute("type", "link");
        map.addAttribute("img", "http://pic27.nipic.com/20130313/9252150_092049419327_2.jpg");
        return "url";
    }

    /**
     * @Description 相等
     * @params [map]
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 8:37
     */
    @RequestMapping("/eq")
    public String eq(ModelMap map) {
        map.addAttribute("name", "neo");
        map.addAttribute("age", 30);
        map.addAttribute("flag", "yes");
        return "eq";
    }

    /**
     * @Description th:switch th:case使用
     * @params [map]
     * @return java.lang.String
     * @author zhangyadong
     * @date 2019/11/19 0019 下午 9:19
     */
    @RequestMapping("/switch")
    public String switchcase(ModelMap map) {
        map.addAttribute("sex", "woman");
        return "switch";
    }

    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User(1L,"大牛",12,"123456");
        User user2=new User(2L,"小牛",6,"123563");
        User user3=new User(3L,"纯洁的微笑",66,"666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return  list;
    }
}
