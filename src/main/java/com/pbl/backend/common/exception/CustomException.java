package com.pbl.backend.common.exception;

import com.pbl.backend.common.response.ResultCode;

import java.text.MessageFormat;

/**
 * @author: 杜东方
 * @date: 2020/5/20
 * @description: 自定义异常类型
 */
public class CustomException extends RuntimeException{

    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        super(resultCode.message());
        this.resultCode = resultCode;
    }

    public CustomException(ResultCode resultCode, Object...args){
        super(resultCode.message());
        String message = MessageFormat.format(resultCode.message(), args);
        resultCode.setMessage(message);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode(){
        return resultCode;
    }
}
