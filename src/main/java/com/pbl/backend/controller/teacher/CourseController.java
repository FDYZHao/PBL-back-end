package com.pbl.backend.controller.teacher;

import com.pbl.backend.common.response.ResultCode;
import com.pbl.backend.entity.Course;
import com.pbl.backend.entity.CourseApply;
import com.pbl.backend.service.teacher.ICourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

import java.util.List;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师课程管理
 */
@RestController
@RequestMapping("/teacher/course")
@Api(tags = "teacher/CourseController-教师课程管理-教师模块")
public class CourseController {

    @Autowired(required=false)
    ICourseService courseService;

    @ApiOperation(value = "新增课程")
    @PostMapping("/courseInfo")
    public Result createCourse(@RequestBody Course course) {
        boolean createResult = courseService.createCourse(course);

        if(createResult)
            return Result.SUCCESS();
        else
            return new Result(ResultCode.COURES_ALREADY_EXISTS);
    }

    @ApiOperation(value = "删除课程")
    @DeleteMapping("/courseInfo/{courseId}")
    public Result deleteCourse(@PathVariable("courseId") Integer courseId){
        boolean deleteResult = courseService.deleteCourse(courseId);

        if(deleteResult)
            return Result.SUCCESS();
        else
            return Result.FAIL();
    }

    @ApiOperation(value = "获取所有任课课程")
    @GetMapping("/courseList/{userId}")
    public Result getAllCourseList(@PathVariable("userId") String userId){
        List<Course> courses = courseService.getCoursesOfTeacher(userId);
        if(courses == null)
            return new Result(ResultCode.RESULT_NULL);
        else
            return Result.SUCCESS(courses);

    }

    @ApiOperation(value = "获取指定课程信息")
    @GetMapping("/courseInfo/{courseId}")
    public Result getCourseInfo(@PathVariable("courseId") Integer courseId){
        Course course = courseService.getCourseByCourseId(courseId);
        if(course == null)
            return new Result(ResultCode.RESULT_NULL);
        else
            return Result.SUCCESS(course);
    }

    @ApiOperation(value = "获取学生退课请求")
    @GetMapping("/courseInfo/stuDropRequests")
    public Result getStuDropRequests(@RequestBody Integer courseId){
        List<CourseApply> list = courseService.getAllCourseApply(courseId);
        if(list == null)
            return new Result(ResultCode.RESULT_NULL);
        else
            return Result.SUCCESS(list);
    }

    @ApiOperation(value = "处理学生退课请求")
    @DeleteMapping("/courseInfo/dropCourseInfo/{userId}/{courseId}/{isAgree}")
    public Result handleStuDropCourse(@PathVariable String userId, @PathVariable Integer courseId,@PathVariable String isAgree){
        boolean handleResult = courseService.handleApply(userId,courseId,isAgree);

        if(handleResult)
            return Result.SUCCESS();
        else
            return Result.FAIL();

    }
}
