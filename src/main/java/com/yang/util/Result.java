package com.yang.util;

import lombok.Data;

import static com.yang.util.ResponseCodeEnum.*;

/**
 * @Author Yang
 * @Date 2024/3/18 10:08
 */
@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;


    private Result() {
    }

    private Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 不返回数据，成功
    public static Result ok() {
        return new Result(SUCCESS.getCode(), SUCCESS.getMessage(), null);
    }

    // 返回数据
    public static <T> Result<T> ok(T data) {
        return new Result<>(SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    // 失败
    public static Result fail() {
        return new Result(FAILURE.getCode(), FAILURE.getMessage(), null);
    }

    public static Result error() {
        return new Result(ERROR.getCode(), ERROR.getMessage(), null);
    }
}
