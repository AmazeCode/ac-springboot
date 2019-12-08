package com.ac.springboot.handler;

import com.ac.springboot.exception.BadRequestException;
import com.ac.springboot.exception.NotFoundException;
import com.ac.springboot.exception.SelfDefineException;
import com.ac.springboot.util.ExceptionResponse;
import com.ac.springboot.util.ExceptionResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @Description: 异常处理类
 * @author: zhangyadong
 * @Date: 2019/12/6 0006 上午 10:39
 * @version: V1.0
 */
@ControllerAdvice
@ResponseBody
public class ExceptionsHandler {

    /**
     * @Description <strong>@ExceptionHandler</strong>指定需要捕获的异常类型,捕获抛出的所有SQLException异常
     * @params [request, ex]
     * @return ExceptionResponse
     * @author zhangyadong
     * @date 2019/12/6 0006 上午 10:42
     */
    @ExceptionHandler(SQLException.class)
    public ExceptionResponse handleSQLException(HttpServletRequest request, Exception ex) {
        return ExceptionResponseUtil.init(100001, "SQL异常！");
    }

    /**
     * @Description <strong>@ExceptionHandler</strong>指定需要捕获的异常类型<strong>@ResponseStatus</strong>指定Http响应状态码：404,捕获抛出的所有NotFoundException异常
     * @params [ex]
     * @return ExceptionResponse
     * @author zhangyadong
     * @date 2019/12/6 0006 上午 10:43
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ExceptionResponse handleNotFoundException(NotFoundException ex) {
        return ExceptionResponseUtil.init(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }

    /**
     * @Description <strong>@ExceptionHandler</strong>指定需要捕获的异常类型,<strong>@ResponseStatus</strong>指定Http响应状态码：400,捕获抛出的所有BadRequestException异常
     * @params [ex]
     * @return ExceptionResponse
     * @author zhangyadong
     * @date 2019/12/6 0006 上午 10:44
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequestException.class)
    public ExceptionResponse handleBadRequestException(BadRequestException ex) {
        return ExceptionResponseUtil.init(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }

    /**
     * @Description <strong>@ExceptionHandler</strong>指定需要捕获的异常类型,<strong>@ResponseStatus</strong>指定Http响应状态码：500.
     * 捕获抛出的所有Exception异常,其中又通过instanceof 判断具体的异常类型，针对异常类型做处理
     * @params [request, ex]
     * @return ExceptionResponse
     * @author zhangyadong
     * @date 2019/12/6 0006 上午 10:44
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ExceptionResponse handleServerErrorException(HttpServletRequest request, Exception ex) {
        String message = ex.getMessage();
        //判断是否属于自定义异常
        if (ex instanceof SelfDefineException) {
            SelfDefineException sd = (SelfDefineException) ex;
            return ExceptionResponseUtil.init(sd.getCode(), message);
        }
        return ExceptionResponseUtil.init(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }
}
