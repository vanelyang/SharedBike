package com.yang.util;

/**
 * @Author Yang
 * @Date 2024/3/18 10:09
 */
public enum ResponseCodeEnum {

    SUCCESS(200, "操作成功"),
    FAILURE(201, "操作失败"), // 系统相关错误
    ERROR(500, "系统异常，请稍后重试"), // 参数相关错误
    PARAM_ERROR(1000, "参数异常");

    private final int code;

    private final String message;

    ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}