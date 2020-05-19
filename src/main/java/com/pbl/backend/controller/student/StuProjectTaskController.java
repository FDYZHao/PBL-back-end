package com.pbl.backend.controller.student;

import com.security.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author: 杜东方
 * @date: 2020/5/18
 * @description: 学生项目任务管理
 */
@RestController
@RequestMapping("/student/course/project")
@Api(tags = "student/StuProjectTaskController-学生项目任务管理-学生模块")
public class StuProjectTaskController {

    @ApiOperation(value = "查看项目内所有任务列表(该任务为教师发布)")
    @GetMapping("/pjTaskList")
    public Result getPjTaskList(){
        return null;
    }

    @ApiOperation(value = "查看项目内指定任务具体信息，本小组的任务完成情况(该任务为教师发布)")
    @GetMapping("/pjTaskInfo")
    public Result getPjTaskInfo(){
        return null;
    }

    @ApiOperation(value = "发布项目小组内任务(该任务为组长发布,在教师发布任务的基础上发布)")
    @PostMapping("/pjGroupTask")
    public Result addPjGroupTask(){
        return null;
    }

    @ApiOperation(value = "查看项目小组内所有任务列表(该任务为组长发布)")
    @GetMapping("/pjGroupTaskList")
    public Result getPjGroupTaskList(){
        return null;
    }

    @ApiOperation(value = "查看项目小组内指定任务具体信息，包含组员任务认领和完成情况")
    @GetMapping("/pjGroupTaskInfo")
    public Result getPjGroupTaskInfo(){
        return null;
    }

    @ApiOperation(value = "删除项目小组内发布的任务")
    @DeleteMapping("/pjGroupTaskInfo")
    public Result deletePjGroupTask(){
        return null;
    }

    @ApiOperation(value = "组长更新教师发布的项目任务完成情况")
    @PutMapping("/pjTaskFinished")
    public Result updatePjTaskFinished(){
        return null;
    }

    @ApiOperation(value = "组员更新组长发布的任务完成情况")
    @PutMapping("/pjGroupTaskFinished")
    public Result updatePjGroupTaskFinished(){
        return null;
    }
}
