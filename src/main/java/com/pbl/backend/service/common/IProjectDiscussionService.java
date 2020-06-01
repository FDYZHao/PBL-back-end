package com.pbl.backend.service.common;

public interface IProjectDiscussionService {

    void getProjectDiscussions(Integer projectId);

    void getProjectDiscussion(Integer discussionId);

    boolean createProjectDiscussion();
}
