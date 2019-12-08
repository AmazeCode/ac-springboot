package com.ac.springboot.exception;

/**
 * @Description: 定义异常
 * @author: zhangyadong
 * @Date: 2019/12/3 0003 下午 10:01
 * @version: V1.0
 */
public class SelfDefineException extends Exception {
    private static final long serialVersionUID = -1959012055742396250L;

    private Integer code;

    /**
     * @Description 构造方法
     * @params []
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 10:03
     */
    public SelfDefineException() {
        super();
    }

    /**
     * @Description 构造方法
     * @params [message]
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 10:03
     */
    public SelfDefineException(String message) {
        super(message);
    }

    /**
     * @Description 构造方法
     * @params
     * @return
     * @author zhangyadong
     * @date 2019/12/3 0003 下午 10:04
     */
    public SelfDefineException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
