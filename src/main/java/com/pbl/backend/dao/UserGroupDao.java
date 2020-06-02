package com.pbl.backend.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserGroupDao {

    //根据项目ID删除该项目所有小组信息
    int deleteGroupsByProjectId(int projectId);

    //学生加入小组,添加关联信息
    int addStuGroup(int projectId, int groupId, String userId);

    //学生退出小组，删除关联信息
    int deleteStuGroup(int groupId, String userId);

    //根据UserId和ProjectId获取groupId
    int getGroupIdByPjIdAndUserId(int projectId, String userId);
}
