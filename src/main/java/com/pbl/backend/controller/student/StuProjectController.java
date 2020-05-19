package com.pbl.backend.controller.student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.security.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 学生项目操作
 */
@RestController
@RequestMapping("/student/course/project")
@Api(tags = "student/StuProjectController-学生项目操作-学生模块")
public class StuProjectController {

    @ApiOperation(value = "获取该课程所有项目")
    @GetMapping("/projectList")
    public Result getAllProjectList(){
        return null;
    }

    @ApiOperation(value = "获取指定项目信息")
    @GetMapping("/projectInfo")
    public Result getProjectInfo(){
        return null;
    }

    @ApiOperation(value = "加入项目")
    @PostMapping("/studentInfo")
    public Result joinProject(){
        return null;
    }

    @ApiOperation(value = "退出项目")
    @DeleteMapping("/studentInfo")
    public Result dropProject(){
        return null;
    }
}
