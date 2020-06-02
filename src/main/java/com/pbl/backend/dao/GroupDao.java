package com.pbl.backend.dao;

import com.pbl.backend.entity.Group;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupDao {

    //创建小组
    int addPjGroup(Group group);

    //根据ProjectId获取所有小组信息
    List<Group> getAllGroupsByPjId(int projectId);

    //根据GroupId获取小组信息
    Group getGroupByGroupId(int groupId);

    //根据ProjectId和GroupName获取group
    Group getGroupByPjIdAndName(int projectId, String groupName);

    //根据项目ID删除该项目所有小组信息
    int deleteGroupsByProjectId(int projectId);


}
