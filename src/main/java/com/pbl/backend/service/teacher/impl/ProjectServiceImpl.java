package com.pbl.backend.service.teacher.impl;

import com.pbl.backend.service.teacher.IProjectService;
import org.springframework.stereotype.Service;

/**
 * @author: 杜东方
 * @date: 2020/5/23
 * @description: 教师课程项目管理业务处理
 */
@Service
public class ProjectServiceImpl implements IProjectService {

    //创建课程项目
    @Override
    public boolean createProject() {
        //该课程存在同名项目

        //课程项目创建成功
        return false;
    }

    //获取课程所有项目
    @Override
    public void getCourseAllProjects() {

    }

    //根据项目ID获取项目
    @Override
    public void getCourseProject() {

    }

    //根据项目ID删除项目

    @Override
    public boolean deleteProject() {
        //项目不存在,删除失败

        //项目删除成功
        return false;
    }
}
