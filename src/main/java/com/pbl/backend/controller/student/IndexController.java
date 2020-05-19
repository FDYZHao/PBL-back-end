package com.pbl.backend.controller.student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 学生注册
 */
@RestController
@RequestMapping("/student")
@Api(tags = "student/IndexController-学生注册-学生模块")
public class IndexController {

    @ApiOperation(value = "学生注册")
    @PostMapping("/register")
    public Result register(){
        return null;
    }
}
