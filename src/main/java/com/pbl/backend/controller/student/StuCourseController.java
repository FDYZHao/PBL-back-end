package com.pbl.backend.controller.student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.security.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 学生课程管理
 */
@RestController
@RequestMapping("/student/course")
@Api(tags = "student/StuCourseController-学生课程管理-学生模块")
public class StuCourseController {

    @ApiOperation(value = "根据课程ID或名称获取课程信息")
    @GetMapping("/courseIndexInfo")
    public Result searchCourseInfo(){
        return null;
    }

    @ApiOperation(value = "加入课程")
    @PostMapping("/studentInfo")
    public Result joinCourse(){
        return null;
    }

    @ApiOperation(value = "退出课程")
    @DeleteMapping("/studentInfo")
    public Result dropCourse(){
        return null;
    }
}
