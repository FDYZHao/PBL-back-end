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

    //创建项目任务
    @Override
    public boolean createPjTask() {
        return false;
    }

    //获取项目所有任务
    @Override
    public void getPjAllTasks() {

    }

    //根据任务Id获取项目任务
    @Override
    public void getPjTask() {

    }

    //删除项目任务
    @Override
    public boolean deletePjTask() {
        return false;
    }
}
