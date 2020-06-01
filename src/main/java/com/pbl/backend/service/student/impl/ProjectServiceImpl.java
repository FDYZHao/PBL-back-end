package com.pbl.backend.service.student.impl;

import com.pbl.backend.service.student.IProjectService;
import org.springframework.stereotype.Service;

/**
 * @author: 杜东方
 * @date: 2020/6/1
 * @description:
 */
@Service
public class ProjectServiceImpl implements IProjectService {

    /**
     * @author:  杜东方
     * @date: 2020/6/1
     * @description: 获取课程所有项目
     * @param: Integer courseId
     * @return: List<Project>
    */
    @Override
    public void getCourseAllProjects(Integer courseId) {

    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 根据项目ID获取项目
     * @param: Integer projectId
     * @return: Project
    */
    @Override
    public void getCourseProject(Integer projectId) {

    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 学生加入项目
     * @param: Integer projectId, String userId
     * @return: boolean
    */
    @Override
    public boolean joinProject(Integer projectId, String userId) {
        return false;
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 学生退出项目
     * @param: Integer projectId, String userId
     * @return: boolean
    */
    @Override
    public boolean dropProject(Integer projectId, String userId) {
        return false;
    }
}
