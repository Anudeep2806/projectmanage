package com.agileprojectmanagement.projectmanagement.controllers;

import com.agileprojectmanagement.projectmanagement.Repository.Projectsrepo;
import com.agileprojectmanagement.projectmanagement.entities.Projects;
import com.agileprojectmanagement.projectmanagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    //get the projects
    @GetMapping("/api/projects")
    public List<Projects> getProjects(){
               return this.projectService.getProjects();
    }

    @PostMapping("/api/projects/new")
    public Projects addProject(@RequestBody Projects projects){
              return this.projectService.addProject(projects);
    }
    @PutMapping("/api/projects/{projectCode}/update")
    public ResponseEntity<Void> updateProjectStatus(@PathVariable Long projectCode,@RequestBody String status){
         this.projectService.updateProjectStatus(projectCode,status);
         return ResponseEntity.ok().build();
    }
}
