package com.pbl.backend.dao;

import com.pbl.backend.entity.Project;
import com.pbl.backend.entity.ProjectTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectTaskDao {

    //添加pjTask
    Integer addProjectTask(ProjectTask projectTask);

    //根据pjId和pjTaskName查找项目
    ProjectTask getPjTaskByPjIdAndName(int projectId, String taskName);

    //获取项目所有任务
    List<ProjectTask> getAllPjTasks(int projectId);

    //根据taskId查找PjTask
    ProjectTask getPjTaskById(int taskId);

    //根据taskId删除项目任务信息
    int deletePjTaskByTaskId(int pjTaskId);

    //根据项目ID删除该项目所有任务信息
    int deletePjTasksByProjectId(int projectId);
}
