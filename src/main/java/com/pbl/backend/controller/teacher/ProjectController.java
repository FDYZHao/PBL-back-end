package com.pbl.backend.controller.teacher;

import com.pbl.backend.service.teacher.IProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师项目管理
 */
@RestController
@RequestMapping("/teacher/course/project")
@Api(tags = "teacher/ProjectController-教师项目管理-教师模块")
public class ProjectController {

    @Autowired
    IProjectService projectService;

    @ApiOperation(value = "新增项目")
    @PostMapping("/projectInfo")
    public Result createProject(){
        boolean createResult = projectService.createProject();
        if(createResult)
            return Result.SUCCESS("课程项目创建成功");
        else
            return Result.FAIL("该课程存在同名项目,项目创建失败");
    }

    @ApiOperation(value = "获取该课程所有项目")
    @GetMapping("/projectList/{courseId}")
    public Result getAllProjectList(@PathVariable("courseId") Integer courseId){
        projectService.getCourseAllProjects(courseId);
        return Result.SUCCESS();
    }

    @ApiOperation(value = "获取指定项目信息")
    @GetMapping("/projectInfo/{projectId}")
    public Result getProjectInfo(@PathVariable("projectId") Integer projectId){
        projectService.getCourseProject(projectId);
        return Result.SUCCESS();
    }

    @ApiOperation(value = "删除项目")
    @DeleteMapping("/projectInfo/{projectId}")
    public Result deleteProject(@PathVariable("projectId") Integer projectId){
        projectService.deleteProject(projectId);
        return Result.SUCCESS();
    }

    @ApiOperation(value = "教师评分，获取项目内所有学生参考数据(所在项目完成情况、讨论留言、小组互评)")
    @GetMapping("/gradeRefData")
    public Result getGradeRefData(){
        return null;
    }

    @ApiOperation(value = "提交/更新学生评分")
    @PutMapping("/gradeData")
    public Result gradeForStu(){
        return null;
    }
}
