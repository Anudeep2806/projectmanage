package com.agileprojectmanagement.projectmanagement.serviceImpl;

import com.agileprojectmanagement.projectmanagement.Repository.Projectsrepo;
import com.agileprojectmanagement.projectmanagement.entities.Projects;
import com.agileprojectmanagement.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private Projectsrepo projectsrepo;
    @Override
    public List<Projects> getProjects() {
        return projectsrepo.findAll();
    }

    @Override
    public Projects addProject(Projects projects) {
        return projectsrepo.save(projects);
    }

    @Override
    public void updateProjectStatus(Long code,String status) {
        Projects projects=projectsrepo.findById(code).orElseThrow(()-> new IllegalArgumentException(code+":Not Found"));
        projects.setStatus(status);
        projectsrepo.save(projects);
    }
}
