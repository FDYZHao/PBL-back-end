package com.pbl.backend.service.teacher.impl;

import com.pbl.backend.service.teacher.IProjectGroupService;
import org.springframework.stereotype.Service;

/**
 * @author: 杜东方
 * @date: 2020/5/23
 * @description: 教师项目小组管理
 */
@Service
public class ProjectGroupServiceImpl implements IProjectGroupService {

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 获取项目所有小组信息
     * @param: Integer projectId
     * @return: List<Group>
     */
    @Override
    public void getPjAllGroups(Integer projectId) {

    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 根据groupId获取小组具体信息
     * @param: Integer groupId
     * @return: Group+User
     */
    @Override
    public void getPjGroup(Integer groupId) {

    }
}
