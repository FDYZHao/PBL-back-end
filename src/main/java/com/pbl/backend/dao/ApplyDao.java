package com.pbl.backend.dao;

import com.pbl.backend.entity.CourseApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyDao {

    //填写退课申请,status：INCHECK，AGREE，REJECT
    Integer submitApply(int userId, int courseId, int statusId);

    //教师获取退课申请
    List<CourseApply> getCourseApply(int courseId);

    //从学生已选课程删除申请课程
    Integer deleteApplyCourse(int courseId);

    //学生查看自己退课申请
    List<CourseApply> studentGetCourseApply(String userId);

    //更新退课申请
    Integer updateApply(String userId, int courseId, String code);

}
