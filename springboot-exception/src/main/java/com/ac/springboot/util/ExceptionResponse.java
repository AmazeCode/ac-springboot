package com.ac.springboot.util;

/**
 * @Description: 异常返回结果类
 * @author: zhangyadong
 * @Date: 2019/12/6 0006 上午 10:46
 * @version: V1.0
 */
public class ExceptionResponse {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String message;

    public ExceptionResponse(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
