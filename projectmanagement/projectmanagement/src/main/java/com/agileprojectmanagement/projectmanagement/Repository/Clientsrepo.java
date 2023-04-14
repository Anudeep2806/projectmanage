package com.agileprojectmanagement.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agileprojectmanagement.projectmanagement.entities.Clients;

public interface Clientsrepo extends JpaRepository<Clients,Long>{

}
