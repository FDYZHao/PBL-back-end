package com.pbl.backend.entity;

import java.sql.Date;

/**
 * @ClassName Project
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class Project {
    private int project_id;
    private int course_id;
    private String project_name;
    private Date startTime;
    private Date endTime;

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public int getCourse_id() {
        return course_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
