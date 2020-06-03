package com.pbl.backend.dao;

import com.pbl.backend.entity.GroupTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupTaskDao {

    //获取小组内所有任务
    List<GroupTask> getAllGroupTasks(int groupId);

    //插入小组任务
    int addGroupTask(GroupTask groupTask);

    //根据taskId获取groupTask
    GroupTask getGroupTaskByTaskId(int taskId);

    //获取小组任务，根据groupId和taskName
    GroupTask getGroupTaskByGpIdAndName(int groupId, String taskName);

    //根据项目ID删除该项目所有小组任务
    int deleteGroupTaskByProjectId(int projectId);

    //根据groupTaskId删除
    int deleteGroupTaskByTaskId(int groupTaskId);

    //更新小组任务为已完成
    int updateGruopTaskFinished(int groupTaskId, int isFinished);
}
