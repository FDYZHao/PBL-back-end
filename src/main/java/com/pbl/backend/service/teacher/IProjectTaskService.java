package com.pbl.backend.service.teacher;

public interface IProjectTaskService {

    boolean createPjTask();

    void getPjAllTasks(Integer projectId);

    void getPjTask(Integer pjTaskId);

    boolean deletePjTask();

}
