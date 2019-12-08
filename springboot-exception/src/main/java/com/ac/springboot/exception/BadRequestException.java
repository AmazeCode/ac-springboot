package com.ac.springboot.exception;

/**
 * @Description: 模拟400错误处理异常
 * @author: zhangyadong
 * @Date: 2019/12/3 0003 下午 9:47
 * @version: V1.0
 */
public class BadRequestException extends Exception{

    private static final long serialVersionUID =  -6091047030159094706L;

    /**
     * @Description 构造方法
     * @params []
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 9:50
     */
    public BadRequestException() {
        super();
    }

    /**
     * @Description 构造方法
     * @params [message]
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 9:50
     */
    public BadRequestException(String message) {
        super(message);
    }
}
