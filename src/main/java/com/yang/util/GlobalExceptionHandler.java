package com.yang.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Yang
 * @Date 2024/3/18 10:59
 */

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    // 全局异常处理
    @ExceptionHandler(value = Exception.class)  //指定出现什么异常执行该方法
    @ResponseBody
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.error();
    }

}
