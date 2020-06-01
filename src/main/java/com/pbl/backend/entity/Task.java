package com.pbl.backend.entity;

import java.sql.Timestamp;

/**
 * @ClassName Task
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class Task {

    private int taskId;
    private int projectId;
    private int groupId;
    private String task_name;
    private String task_discribe;
    private Timestamp task_startTime;
    private Timestamp task_endTime;

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTask_discribe() {
        return task_discribe;
    }

    public String getTask_name() {
        return task_name;
    }

    public Timestamp getTask_endTime() {
        return task_endTime;
    }

    public Timestamp getTask_startTime() {
        return task_startTime;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setTask_discribe(String task_discribe) {
        this.task_discribe = task_discribe;
    }

    public void setTask_endTime(Timestamp task_endTime) {
        this.task_endTime = task_endTime;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setTask_startTime(Timestamp task_startTime) {
        this.task_startTime = task_startTime;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

}
