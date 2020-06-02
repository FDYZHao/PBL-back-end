package com.pbl.backend.service.teacher;

import com.pbl.backend.entity.Group;

import java.util.List;

public interface IProjectGroupService {

    List<Group> getPjAllGroups(Integer projectId);

    Group getPjGroup(Integer groupId);
}
