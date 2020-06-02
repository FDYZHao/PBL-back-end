package com.pbl.backend.entity;

/**
 * @ClassName ProjectScore
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class ProjectScore {

    private int projectId;
    private String projectName;
    private String userId;
    private String userName;

    private int stud_grade;
    private int teacher_grade;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getStud_grade() {
        return stud_grade;
    }

    public int getTeacher_grade() {
        return teacher_grade;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setStud_grade(int stud_grade) {
        this.stud_grade = stud_grade;
    }

    public void setTeacher_grade(int teacher_grade) {
        this.teacher_grade = teacher_grade;
    }
}
