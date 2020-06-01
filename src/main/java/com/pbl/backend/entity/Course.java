package com.pbl.backend.entity;

/**
 * @ClassName Course
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class Course {
    private int courseId;
    private String courseName;

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}
