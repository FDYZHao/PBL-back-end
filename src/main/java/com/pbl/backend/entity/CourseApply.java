package com.pbl.backend.entity;

/**
 * @ClassName CourseApply
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class CourseApply {
    private int courseId;
    private String courseName;
    private String applyResult;
    private String userId;
    private String userName;

    public static final String INCHECK = "0";
    public static final String AGREE = "1";
    public static final String REJECT = "2";

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getApplyResult() {
        return applyResult;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
