package com.pbl.backend.service.student;

public interface IPjGroupTaskService {

    boolean createPjGroupTask();

    void getPjGroupAllTasks(Integer groupId);

    void getPjGroupTask();

    boolean deletePjGroupTask();

    boolean updateGroupTask(Integer groupId);
}
