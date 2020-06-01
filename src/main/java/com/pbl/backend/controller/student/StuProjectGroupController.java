package com.pbl.backend.controller.student;

import com.pbl.backend.common.response.Result;
import com.pbl.backend.service.student.IProjectGroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 学生项目小组管理
 */
@RestController
@RequestMapping("/student/course/project/group")
@Api(tags = "student/StuProjectGroupController-学生项目小组管理-学生模块")
public class StuProjectGroupController {

    @Autowired
    private IProjectGroupService stuProjectGroupService;

    @ApiOperation(value = "获取该课程项目所有小组")
    @GetMapping("/pjGroupList/{projectId}")
    public Result getAllPjGroupList(@PathVariable("projectId") Integer projectId){
        stuProjectGroupService.getPjAllGroups(projectId);
        return null;
    }

    @ApiOperation(value = "获取指定项目小组信息")
    @GetMapping("/pjGroupInfo/{groupId}")
    public Result getPjGroupInfo(@PathVariable("groupId") Integer groupId){
        stuProjectGroupService.getPjGroup(groupId);
        return null;
    }

    @ApiOperation(value = "加入项目小组")
    @PostMapping("/studentInfo/{groupId}/{userId}")
    public Result joinPjGroup(@PathVariable("groupId") Integer groupId, @PathVariable("userId") String userId){
        stuProjectGroupService.joinPjGroup(groupId, userId);
        return null;
    }

    @ApiOperation(value = "退出项目小组")
    @DeleteMapping("/studentInfo/{groupId}/{userId}")
    public Result dropPjGroup(@PathVariable("groupId") Integer groupId, @PathVariable("userId") String userId) {
        stuProjectGroupService.dropPjGroup(groupId, userId);
        return null;
    }
}
