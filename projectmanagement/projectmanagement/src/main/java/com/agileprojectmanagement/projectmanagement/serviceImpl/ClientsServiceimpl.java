package com.agileprojectmanagement.projectmanagement.serviceImpl;

import com.agileprojectmanagement.projectmanagement.Repository.Clientsrepo;
import com.agileprojectmanagement.projectmanagement.entities.Clients;
import com.agileprojectmanagement.projectmanagement.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsServiceimpl implements ClientsService {

    @Autowired
    private Clientsrepo clientsrepo;
    @Override
    public List<Clients> getClients() {
        return clientsrepo.findAll();
    }
}
