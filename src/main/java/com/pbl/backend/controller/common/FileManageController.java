package com.pbl.backend.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/19
 * @description: 项目内用户文件管理
 */
@RestController
@RequestMapping("/course/project")
@Api(tags = "common/FileManageController-项目内用户文件管理-教师/学生共用模块")
public class FileManageController {

    @ApiOperation(value = "用户上传项目分享文件")
    @PostMapping("/sharedFile")
    public Result uploadFile(){
        return null;
    }

    @ApiOperation(value = "用户浏览项目分享文件")
    @GetMapping("/sharedFiles")
    public Result getSharedFiles(){
        return null;
    }

    @ApiOperation(value = "用户下载项目分享文件")
    @GetMapping("/sharedFile")
    public Result downloadSharedFile(){
        return null;
    }

    @ApiOperation(value = "用户删除项目分享文件")
    @DeleteMapping("/sharedFile")
    public Result deleteSharedFile(){
        return null;
    }
}
