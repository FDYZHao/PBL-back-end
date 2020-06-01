package com.pbl.backend.controller.teacher;

import com.pbl.backend.service.teacher.IProjectGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;
/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师项目小组管理
 */
@RestController
@RequestMapping("/teacher/course/project")
@Api(tags = "teacher/ProjectGroupController-教师项目小组管理-教师模块")
public class ProjectGroupController {

    @Autowired
    IProjectGroupService projectGroupService;

    @ApiOperation(value = "获取该课程项目所有小组")
    @GetMapping("/pjGroupList/{projectId}")
    public Result getAllPjGroupList(@PathVariable("projectId") Integer projectId){
        projectGroupService.getPjAllGroups(projectId);
        return Result.SUCCESS();
    }

    @ApiOperation(value = "获取指定项目小组信息")
    @GetMapping("/pjGroupInfo/{groupId}")
    public Result getPjGroupInfo(@PathVariable("groupId") Integer groupId){
        projectGroupService.getPjGroup(groupId);
        return Result.SUCCESS();
    }

}
