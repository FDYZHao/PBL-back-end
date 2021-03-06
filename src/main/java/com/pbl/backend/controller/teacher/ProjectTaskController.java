package com.pbl.backend.controller.teacher;

import com.pbl.backend.entity.ProjectTask;
import com.pbl.backend.service.teacher.IProjectTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

import java.util.List;

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
    public Result addPjTask(@RequestBody ProjectTask projectTask){
        boolean result = projectTaskService.createPjTask(projectTask);
        return result ? Result.SUCCESS() : Result.FAIL();
    }

    @ApiOperation(value = "查看项目内所有任务列表")
    @GetMapping("/pjTaskList/{projectId}")
    public Result getPjTaskList(@PathVariable("projectId") Integer projectId){
        List<ProjectTask> projectTasks = projectTaskService.getPjAllTasks(projectId);
        return Result.SUCCESS(projectTasks);
    }

    @ApiOperation(value = "查看项目内指定任务具体信息，包含每个小组的任务完成情况")
    @GetMapping("/pjTaskInfo/{pjTaskId}")
    public Result getPjTaskInfo(@PathVariable("pjTaskId") Integer pjTaskId){
        ProjectTask projectTask = projectTaskService.getPjTask(pjTaskId);
        return Result.SUCCESS(projectTask);
    }

    @ApiOperation(value = "删除项目任务")
    @DeleteMapping("/pjTaskInfo/{pjTaskId}")
    public Result deletePjTask(@PathVariable("pjTaskId") Integer pjTaskId){
        projectTaskService.deletePjTask(pjTaskId);
        return Result.SUCCESS();
    }

}
