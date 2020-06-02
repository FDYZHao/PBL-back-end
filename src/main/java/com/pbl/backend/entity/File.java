package com.pbl.backend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @ClassName File
 * @Description
 * @Author 孟超
 * @Date 2020/6/1
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {

    private int fileId;
    private String userId;
    private int projectId;
    private String fileName;
    private String filePath;
    private Date uploadTime;

    public File(String userId, int projectId, String fileName, String filePath){
        this.userId = userId;
        this.projectId = projectId;
        this.fileName = fileName;
        this.filePath = filePath;
        this.uploadTime = new Date(System.currentTimeMillis());
    }

}
