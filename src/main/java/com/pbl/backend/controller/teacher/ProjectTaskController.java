package com.pbl.backend.controller.teacher;

import com.pbl.backend.service.teacher.IProjectTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师项目任务管理
 */
@RestController
@RequestMapping("/teacher/course/project")
@Api(tags = "teacher/ProjectTaskController-教师项目任务管理-教师模块")
public class ProjectTaskController {

    @Autowired
    IProjectTaskService projectTaskService;

    @ApiOperation(value = "发布项目任务")
    @PostMapping("/pjTask")
    public Result addPjTask(){
        projectTaskService.createPjTask();
        return Result.SUCCESS();
    }

    @ApiOperation(value = "查看项目内所有任务列表")
    @GetMapping("/pjTaskList")
    public Result getPjTaskList(){
        projectTaskService.getPjAllTasks();
        return Result.SUCCESS();
    }

    @ApiOperation(value = "查看项目内指定任务具体信息，包含每个小组的任务完成情况")
    @GetMapping("/pjTaskInfo")
    public Result getPjTaskInfo(){
        projectTaskService.getPjTask();
        return Result.SUCCESS();
    }

    @ApiOperation(value = "删除项目任务")
    @DeleteMapping("/pjTaskInfo")
    public Result deletePjTask(){
        projectTaskService.deletePjTask();
        return Result.SUCCESS();
    }

}
