package com.pbl.backend.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.pbl.backend.common.response.Result;

/**
 * @author: 杜东方
 * @date: 2020/5/19
 * @description: 课程项目用户讨论
 */
@RestController
@RequestMapping("/course/project")
@Api(tags = "common/DiscussController-课程项目用户讨论-教师/学生共用模块")
public class DiscussController {

    @ApiOperation(value = "获取课程项目的讨论版主题信息")
    @GetMapping("/discussionList/{projectId}")
    public Result getPjDiscussions(@PathVariable("projectId") Integer projectId){
        return null;
    }

    @ApiOperation(value = "获取课程项目的讨论版某个讨论的具体信息")
    @GetMapping("/discussionInfo/{discussionId}")
    public Result getPjDiscussion(@PathVariable("discussionId") Integer discussionId){
        return null;
    }

    @ApiOperation(value = "在课程项目内发起主题提问")
    @PostMapping("/discussion")
    public Result createDiscussion(){
        return null;
    }

    @ApiOperation(value = "在课程项目内某个讨论主题发起回复")
    @PostMapping("/discussionReply")
    public Result createDiscussionReply(){
        return null;
    }


}
