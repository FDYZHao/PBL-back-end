package com.pbl.backend.service.student;

/**
 * @author: 杜东方
 * @date: 2020/6/1
 * @description:
 */
public interface IProjectGroupService {

    void getPjAllGroups(Integer projectId);

    void getPjGroup(Integer groupId);

    boolean joinPjGroup(Integer groupId, String userId);

    boolean dropPjGroup(Integer groupId, String userId);
}
