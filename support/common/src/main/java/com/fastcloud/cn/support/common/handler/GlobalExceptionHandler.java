package com.fastcloud.cn.support.common.handler;

import com.fastcloud.cn.support.domain.norm.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 异常的处理器
 *
 * @author OreChou
 * @create 2018-06-12 7:40 PM
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e){
        log.error(e.getMessage(), e);
        return Response.error(e.getMessage());
    }

}