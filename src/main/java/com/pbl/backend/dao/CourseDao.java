package com.pbl.backend.dao;

import com.pbl.backend.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {

    //添加course,成功返回行数
    Integer addCourse(Course course);

    //添加进course——teacher
    Integer updateTeaches(String userId, int courseId);

    //删除course
    Integer deleteCourse(int course);

    //删除tea-course表
    Integer deleteTeaCourse(String userId,int courseId);

    //查找course
    Course getCourse(int courseId, String courseName);

    //根据id或者名称查找
    Course getCourseByCourseId(int courseId);
    Course getCourseByCourseName(String courseName);

    //删除学生所选课程
    Integer deleteStudentTake(int courseId);

    //获取老师所授课程
    List<Course> getCourseByTeacherId(String userId);


}
