package com.pbl.backend.controller.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @ApiOperation(value = "在课程内发起提问")
    @PostMapping("/discussion")
    public Result createDiscussion(){
        return null;
    }

    @ApiOperation(value = "在课程内发起提问")
    @PostMapping("/discussionReply")
    public Result createDiscussionReply(){
        return null;
    }


}
