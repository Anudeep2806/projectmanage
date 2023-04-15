package com.agileprojectmanagement.projectmanagement.service;

import com.agileprojectmanagement.projectmanagement.entities.Projects;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectService {

    public List<Projects> getProjects();

    public Projects addProject(Projects projects);

    public void updateProjectStatus(Long code,String status);

}
