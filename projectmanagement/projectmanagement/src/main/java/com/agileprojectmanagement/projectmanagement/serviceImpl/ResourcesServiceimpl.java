package com.agileprojectmanagement.projectmanagement.serviceImpl;

import com.agileprojectmanagement.projectmanagement.Repository.Resourcesrepo;
import com.agileprojectmanagement.projectmanagement.entities.Resources;
import com.agileprojectmanagement.projectmanagement.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceimpl implements ResourcesService {
    @Autowired
    private Resourcesrepo resourcesrepo;

    @Override
    public Resources addResource(Resources resource) {
        return resourcesrepo.save(resource);
    }
}
