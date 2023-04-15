package com.agileprojectmanagement.projectmanagement.controllers;


import com.agileprojectmanagement.projectmanagement.entities.Resources;
import com.agileprojectmanagement.projectmanagement.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourcesController {

    @Autowired
    private ResourcesService resourcesService;


    @PostMapping("/api/projects/addresource")
    public Resources addResource(@RequestBody Resources resource){
        return this.resourcesService.addResource(resource);

    }


}
