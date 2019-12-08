package com.ac.springboot.controller;

import com.ac.springboot.exception.BadRequestException;
import com.ac.springboot.exception.NotFoundException;
import com.ac.springboot.exception.SelfDefineException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @Description: TODO
 * @author: zhangyadong
 * @Date: 2019/12/6 0006 下午 2:34
 * @version: V1.0
 */
@RestController
public class ExceptionController {

    @RequestMapping("/{view}")
    public Object index(@PathVariable("view") String view) throws Exception {
        View v = View.getView(view);
        switch (v) {
            case sql:
                throw new SQLException("数据库异常！");
            case bad:
                throw new BadRequestException("失败的请求！");
            case self:
                throw new SelfDefineException("这是一个自定义的异常！",50000);
            case exception:
                return 1 / 0;
            default:
                throw new NotFoundException("页面未找到！");
        }
    }

    /**
     * @Description 测试代码：有效页面枚举类
     * @params
     * @return
     * @author zhangyadong
     * @date 2019/12/6 0006 下午 2:36
     */
    private enum View {
        //为value
        sql, bad, self, exception, none;

        public static View getView(String view) {
            for (View v : View.values()) {
                if (v.toString().equalsIgnoreCase(view)) {
                    return v;
                }
            }
            return none;
        }
    }
}
