package com.pbl.backend.dao;

import com.pbl.backend.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseDao {

    //添加course,成功返回行数
    Integer addCourse(int courseId, String courseName);

    //添加进course——teacher
    Integer updateTeaches(String userId, int courseId);

    //删除course
    Integer deleteCourse(int course);

    //删除tea-course表
    Integer deleteTeaCourse(String userId,int courseId);

    //查找course
    Course findCourse(int courseId, String courseName);

    //根据id或者名称查找
    Course findCourseByCourseId(int courseId);
    Course findCourseByCourseName(String courseName);



}
