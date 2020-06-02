package com.pbl.backend.service.teacher;

import com.pbl.backend.entity.ProjectTask;

import java.util.List;

public interface IProjectTaskService {

    boolean createPjTask(ProjectTask projectTask);

    List<ProjectTask> getPjAllTasks(Integer projectId);

    ProjectTask getPjTask(Integer pjTaskId);

    boolean deletePjTask(int taskId);

}
