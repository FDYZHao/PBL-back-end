package com.pbl.backend.service.student;

import com.pbl.backend.entity.GroupTask;

import java.util.List;

public interface IPjGroupTaskService {

    boolean createPjGroupTask();

    List<GroupTask> getPjGroupAllTasks(Integer groupId);

    GroupTask getPjGroupTask();

    boolean deletePjGroupTask();

    boolean updateGroupTask(Integer groupId);
}
