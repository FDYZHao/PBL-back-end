package com.pbl.backend.service.teacher.impl;

import com.pbl.backend.dao.GroupDao;
import com.pbl.backend.entity.Group;
import com.pbl.backend.service.teacher.IProjectGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 杜东方
 * @date: 2020/5/23
 * @description: 教师项目小组管理
 */
@Service
public class ProjectGroupServiceImpl implements IProjectGroupService {

    @Autowired
    private GroupDao groupDao;

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 获取项目所有小组信息
     * @param: Integer projectId
     * @return: List<Group>
     */
    @Override
    public List<Group> getPjAllGroups(Integer projectId) {
        return groupDao.getAllGroupsByPjId(projectId);
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 根据groupId获取小组具体信息
     * @param: Integer groupId
     * @return: Group+User
     */
    @Override
    public Group getPjGroup(Integer groupId) {
        return groupDao.getGroupByGroupId(groupId);
    }
}
