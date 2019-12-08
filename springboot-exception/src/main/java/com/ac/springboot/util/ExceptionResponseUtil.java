package com.ac.springboot.util;

/**
 * @Description: 异常工具类
 * @author: zhangyadong
 * @Date: 2019/12/6 0006 上午 10:51
 * @version: V1.0
 */
public class ExceptionResponseUtil {

    /**
     * @Description 初始化异常返回
     * @params [code, message]
     * @return com.ac.springboot.util.ExceptionResponse
     * @author zhangyadong
     * @date 2019/12/6 0006 上午 10:54
     */
    public static ExceptionResponse init(Integer code, String message) {
        return new ExceptionResponse(code, message);
    }
}
