package com.ac.springboot.exception;

import java.io.Serializable;

/**
 * @Description: 模拟404请求异常
 * @author: zhangyadong
 * @Date: 2019/12/3 0003 下午 9:50
 * @version: V1.0
 */
public class NotFoundException extends Exception{

    private static final long serialVersionUID = -8403482975708388257L;

    /**
     * @Description 构造方法
     * @params []
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 9:59
     */
    public NotFoundException() {
        super();
    }

    /**
     * @Description 构造方法
     * @params [message]
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 10:00
     */
    public NotFoundException(String message) {
        super(message);
    }
}
