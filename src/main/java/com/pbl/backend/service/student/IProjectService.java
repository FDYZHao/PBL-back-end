package com.pbl.backend.service.student;

public interface IProjectService {

    void getCourseAllProjects(Integer courseId);

    void getCourseProject(Integer projectId);

    boolean joinProject(Integer projectId, String userId);

    boolean dropProject(Integer projectId, String userId);
}
