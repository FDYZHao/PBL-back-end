package com.pbl.backend.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DiscussionDao {

    //根据项目ID删除该项目所有讨论
    int deleteDiscsByProjectId(int projectId);
}
