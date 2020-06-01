package com.pbl.backend.service.teacher.impl;

import com.pbl.backend.service.teacher.IProjectTaskService;
import org.springframework.stereotype.Service;

/**
 * @author: 杜东方
 * @date: 2020/5/23
 * @description: 教师项目任务管理
 */
@Service
public class ProjectTaskServiceImpl implements IProjectTaskService {

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 创建项目任务
     * @param:
     * @return: boolean
    */
    @Override
    public boolean createPjTask() {
        return false;
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 获取项目所有任务
     * @param: Integer projectId
     * @return: List<ProjectTask>
    */
    @Override
    public void getPjAllTasks(Integer projectId) {

    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 根据任务Id获取项目任务，包含每组的完成情况
     * @param: Integer pjTaskId
     * @return:
    */
    @Override
    public void getPjTask(Integer pjTaskId) {

    }

    //删除项目任务
    @Override
    public boolean deletePjTask() {
        return false;
    }
}
