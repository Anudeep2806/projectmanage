package com.agileprojectmanagement.projectmanagement.controllers;

import com.agileprojectmanagement.projectmanagement.entities.Clients;
import com.agileprojectmanagement.projectmanagement.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class clientsController {
    @Autowired
    private ClientsService clientsService;
    @GetMapping("/api/clients")
    public List<Clients> getClients(){
        return this.clientsService.getClients();
    }
}
