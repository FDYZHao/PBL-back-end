package com.pbl.backend.entity;

import lombok.Data;

import java.sql.Date;

/**
 * @ClassName Course
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

@Data
public class Course {
    private Integer courseId;
    private String teacherId;
    private String courseName;
    private Date courseStartTime;
    private Date courseEndTime;

}
