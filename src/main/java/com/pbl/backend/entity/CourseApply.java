package com.pbl.backend.entity;

import lombok.Data;

/**
 * @ClassName CourseApply
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/
@Data
public class CourseApply {
    private int courseId;
    private String courseName;
    private String applyResult;
    private String userId;
    private String userName;

    public static final String INCHECK = "0";
    public static final String AGREE = "1";
    public static final String REJECT = "2";

}
