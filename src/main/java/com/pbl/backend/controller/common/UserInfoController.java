package com.pbl.backend.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pbl.backend.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 用户个人信息管理
 */
@RestController
@RequestMapping("/user")
@Api(tags = "common/UserInfoController-用户个人信息管理-管理员/教师/学生共用模块")
public class UserInfoController {

    @ApiOperation(value = "更新用户密码")
    @PutMapping("/userProfilePic")
    public Result updateUserProfilePic(){
        return null;
    }

    @ApiOperation(value = "上传用户头像")
    @PostMapping("/userProfilePic")
    public Result addUserProfilePic(){
        return null;
    }

    @ApiOperation(value = "更新用户头像")
    @PutMapping("/pass")
    public Result updateUserPassword(){
        return null;
    }


    /**
     * 更改用户信息，不包含密码和头像
     */
    @ApiOperation(value = "更新管理员信息-不包含密码和头像")
    @PutMapping("/adminInfo")
    public Result updateAdminInfo(){
        return null;
    }

    @ApiOperation(value = "更新老师个人信息-不包含密码和头像")
    @PutMapping("/teacherInfo")
    public Result updateTeacherInfo(){
        return null;
    }

    @ApiOperation(value = "更新学生个人信息-不包含密码和头像")
    @PutMapping("/studentInfo")
    public Result updateStuInfo(){
        return null;
    }

}
