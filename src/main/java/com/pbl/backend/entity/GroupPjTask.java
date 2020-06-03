package com.pbl.backend.entity;

import lombok.Data;

/**
 * @author: 杜东方
 * @date: 2020/6/3
 * @description:
 */
@Data
public class GroupPjTask {

    private Integer projectTaskId;
    private Integer groupId;
    private Integer groupTaskNum;
    private Integer groupTaskFinishNum;
    private Integer isFinished;
}
