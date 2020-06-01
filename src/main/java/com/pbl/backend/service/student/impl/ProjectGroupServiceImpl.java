package com.pbl.backend.service.student.impl;

import com.pbl.backend.service.student.IProjectGroupService;
import org.springframework.stereotype.Service;

/**
 * @author: 杜东方
 * @date: 2020/6/1
 * @description:
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

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 加入某个项目小组
     * @param: Integer groupId, String userId
     * @return: boolean
    */
    @Override
    public boolean joinPjGroup(Integer groupId, String userId) {
        return false;
    }

    /**
     * @author:
     * @date: 2020/6/1
     * @description: 退出某个项目小组
     * @param: Integer groupId, String userId
     * @return: boolean
    */
    @Override
    public boolean dropPjGroup(Integer groupId, String userId) {
        return false;
    }
}
