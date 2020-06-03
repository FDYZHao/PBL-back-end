package com.pbl.backend.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TakesDao {

    //学生选课
    Integer addCourse(String userId, int courseId);

    //删除所选课程
    Integer deleteCourse(String userId, int courseId);
}
