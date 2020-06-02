package com.pbl.backend.dao;

import com.pbl.backend.entity.Project;
import com.pbl.backend.entity.ProjectScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectDao {

    //添加pj
    Integer addProject(String pjName);

    //查看PJ
    List<Project> getAllProject();

    //查找pj
    Project getProjectById(int projectId);
    Project getProjectByName(String projectName);

    //删除pj
    Integer deletePj(int projectId);

    //清除course_Pj
    Integer deleteCourse_Pj(int courseId, int projectId);

    //清除student_PJ
    Integer deleteStudent_Pj(String userId, int projectId);

    //查看pj成绩
    ProjectScore getScore(String userId, int projectId);
}
