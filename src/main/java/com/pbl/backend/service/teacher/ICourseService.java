package com.pbl.backend.service.teacher;

import com.pbl.backend.entity.Course;
import com.pbl.backend.entity.CourseApply;

import java.util.List;

public interface ICourseService {

    boolean createCourse(Course course);

    boolean deleteCourse(int courseId);

    List<Course> getCoursesOfTeacher(String teacherId);

    Course getCourseByCourseId(int courseId);

    List<CourseApply> getAllCourseApply(int courseId);

    boolean handleApply(String userId, int courseId ,String code);
}
