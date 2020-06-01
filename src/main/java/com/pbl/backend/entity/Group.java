package com.pbl.backend.entity;

/**
 * @ClassName Group
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

public class Group {
    private int groupId;
    private int projectId;
    private String groupName;
    private String groupHeader;

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupHeader(String groupHeader) {
        this.groupHeader = groupHeader;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
