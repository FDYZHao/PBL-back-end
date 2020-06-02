package com.pbl.backend.dao;

import com.pbl.backend.entity.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectDao {

    //添加pj
    Integer addProject(Project project);

    //根据courseId和projectName查找项目
    Project getProjectByCourseIdAndName(int courseId, String projectName);

    //获取课程所有PJ
    List<Project> getAllProject(int courseId);

    //根据PjId查找Pj
    Project getProjectById(int projectId);

    //删除pj
    int deleteProject(int projectId);

}
