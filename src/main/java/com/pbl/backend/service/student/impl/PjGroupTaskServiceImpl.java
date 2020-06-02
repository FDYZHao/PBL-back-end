package com.pbl.backend.service.student.impl;

import com.pbl.backend.dao.GroupTaskDao;
import com.pbl.backend.entity.GroupTask;
import com.pbl.backend.service.student.IPjGroupTaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: 杜东方
 * @date: 2020/6/1
 * @description:
 */
public class PjGroupTaskServiceImpl implements IPjGroupTaskService {

    @Autowired
    private GroupTaskDao groupTaskDao;
    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description:
     * @param:
     * @return:
    */
    @Override
    public boolean createPjGroupTask() {
        return false;
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 查看小组内任务列表
     * @param: Integer groupId
     * @return:
    */
    @Override
    public List<GroupTask> getPjGroupAllTasks(Integer groupId) {
        return groupTaskDao.getAllGroupTasks(groupId);
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description:
     * @param:
     * @return:
    */
    @Override
    public GroupTask getPjGroupTask() {
        return null;
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description:
     * @param:
     * @return:
    */
    @Override
    public boolean deletePjGroupTask() {
        return false;
    }

    /**
     * @author: 杜东方
     * @date: 2020/6/1
     * @description: 组员更新组内任务完成情况
     * @param: Integer groupId
     * @return: boolean
    */
    @Override
    public boolean updateGroupTask(Integer groupId) {
        return false;
    }
}
