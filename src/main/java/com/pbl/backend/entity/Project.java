package com.pbl.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @ClassName Project
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Integer projectId;
    private Integer courseId;
    private String projectName;
    private Date startTime;
    private Date endTime;

}
