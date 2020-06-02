package com.pbl.backend.dao;

import com.pbl.backend.entity.ProjectScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectScoreDao {

    //根据项目ID删除该项目所有成绩信息
    int deleteScoresByProjectId(int projectId);

    //删除学生与某个项目的关联信息
    int deleteStuProjectInfo(int projectId, String stuId);

    //新增学生与某个项目的关联信息
    int addStuProjectInfo(int projectId, String stuId);

    //根据projectId和stuId,获取该学生成绩信息
    ProjectScore getPjScoreByPjIdAndStuId(int projectId, String stuId);
}
