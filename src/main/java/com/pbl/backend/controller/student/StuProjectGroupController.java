package com.pbl.backend.controller.student;

import com.security.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "加入项目小组")
    @PostMapping("/studentInfo")
    public Result joinPjGroup(){
        return null;
    }

    @ApiOperation(value = "退出项目小组")
    @DeleteMapping("/studentInfo")
    public Result dropPjGroup() {
        return null;
    }
}
