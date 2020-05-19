package com.pbl.backend.controller.teacher;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.security.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师项目管理
 */
@RestController
@RequestMapping("/teacher/course/project")
@Api(tags = "teacher/ProjectController-教师项目管理-教师模块")
public class ProjectController {

    @ApiOperation(value = "新增项目")
    @PostMapping("/projectInfo")
    public Result createProject(){
        return null;
    }

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

    @ApiOperation(value = "删除项目")
    @DeleteMapping("/projectInfo")
    public Result deleteProject(){
        return null;
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
