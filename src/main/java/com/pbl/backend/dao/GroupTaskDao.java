package com.pbl.backend.dao;

import com.pbl.backend.entity.GroupTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupTaskDao {

    //获取小组内所有任务
    List<GroupTask> getAllGroupTasks(int groupId);

    //根据项目ID删除该项目所有小组任务
    int deleteGroupTaskByProjectId(int projectId);
}
