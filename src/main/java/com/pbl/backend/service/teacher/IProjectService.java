package com.pbl.backend.service.teacher;

public interface IProjectService {

    boolean createProject();

    void getCourseAllProjects(Integer courseId);

    void getCourseProject(Integer projectId);

    boolean deleteProject(Integer projectId);
}
