package com.pbl.backend.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @ClassName ProjectTask
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

@Data
public class ProjectTask {

    private Integer taskId;
    private Integer projectId;
    private String taskName;
    private String taskDiscribe;
    private Timestamp taskStartTime;
    private Timestamp taskEndTime;

}
