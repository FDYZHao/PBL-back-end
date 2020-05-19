package com.pbl.backend.controller.teacher;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.security.common.response.Result;
/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 教师项目小组管理
 */
@RestController
@RequestMapping("/teacher/course/project")
@Api(tags = "teacher/ProjectGroupController-教师项目小组管理-教师模块")
public class ProjectGroupController {

    @ApiOperation(value = "获取该课程项目所有小组")
    @GetMapping("/pjGroupList")
    public Result getAllPjGroupList(){
        return null;
    }

    @ApiOperation(value = "获取指定项目小组信息")
    @GetMapping("/pjGroupInfo")
    public Result getPjGroupInfo(){
        return null;
    }

}
