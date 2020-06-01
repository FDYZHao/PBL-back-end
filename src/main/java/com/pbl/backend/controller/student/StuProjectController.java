package com.pbl.backend.controller.student;

import com.pbl.backend.service.student.IProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

import javax.annotation.Resource;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 学生项目操作
 */
@RestController
@RequestMapping("/student/course/project")
@Api(tags = "student/StuProjectController-学生项目操作-学生模块")
public class StuProjectController {

    @Resource
    private IProjectService stuProjectService;

    @ApiOperation(value = "获取该课程所有项目")
    @GetMapping("/projectList/{courseId}")
    public Result getAllProjectList(@PathVariable("courseId") Integer courseId){
        stuProjectService.getCourseAllProjects(courseId);
        return null;
    }

    @ApiOperation(value = "获取指定项目信息")
    @GetMapping("/projectInfo/{projectId}")
    public Result getProjectInfo(@PathVariable("projectId") Integer projectId){
        stuProjectService.getCourseProject(projectId);
        return null;
    }

    @ApiOperation(value = "加入项目")
    @PostMapping("/studentPjInfo/{projectId}/{userId}")
    public Result joinProject(@PathVariable("projectId") Integer projectId, @PathVariable("userId") String userId){
        return null;
    }

    @ApiOperation(value = "退出项目")
    @DeleteMapping("/studentPjInfo/{projectId}/{userId}")
    public Result dropProject(@PathVariable("projectId") Integer projectId, @PathVariable("userId") String userId){
        return null;
    }
}
