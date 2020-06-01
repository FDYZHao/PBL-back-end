package com.pbl.backend.controller.teacher;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师课程管理
 */
@RestController
@RequestMapping("/teacher/course")
@Api(tags = "teacher/CourseController-教师课程管理-教师模块")
public class CourseController {

    @ApiOperation(value = "新增课程")
    @PostMapping("/courseInfo")
    public Result createCourse(){
        return null;
    }

    @ApiOperation(value = "删除课程")
    @DeleteMapping("/courseInfo")
    public Result deleteCourse(){
        return null;
    }

    @ApiOperation(value = "获取所有任课课程")
    @GetMapping("/courseList")
    public Result getAllCourseList(){
        return null;
    }

    @ApiOperation(value = "获取指定课程信息")
    @GetMapping("/courseInfo")
    public Result getCourseInfo(){
        return null;
    }

    @ApiOperation(value = "获取学生退课请求")
    @GetMapping("/courseInfo/stuDropRequests")
    public Result getStuDropRequests(){
        return null;
    }

    @ApiOperation(value = "处理学生退课请求")
    @DeleteMapping("/courseInfo/dropCourseInfo")
    public Result handleStuDropCourse(){
        return null;
    }
}
