package com.security.common.response;

/**
 * @author: 杜东方
 * @date: 2020/5/17
 * @description: 通用响应状态
 */
public enum  ResultCode {
    /* 成功状态码 */
    SUCCESS(0, "操作成功"),

    /* 错误状态码 */
    FAIL(-1,"操作失败！"),

    /* 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /* 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户未登录，请先登录"),


    /* 权限错误：70001-79999 */
    PERMISSION_TOKEN_INVALID(70006, "无效token"),
    PERMISSION_TOKEN_EXPIRED(70004, "token已过期"),
    PERMISSION_SIGNATURE_ERROR(70007, "签名失败");


    //操作码
    private int code;
    //提示信息
    private String message;

    ResultCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
