package com.pbl.backend.entity;

import lombok.Data;

/**
 * @ClassName Disscussion
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/

@Data
public class Discussion {
    private Integer discId;
    private String userId;
    private Integer pjId;
    private String discTitle;
    private String discMessage;

}
