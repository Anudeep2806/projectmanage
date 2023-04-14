package com.agileprojectmanagement.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agileprojectmanagement.projectmanagement.entities.Resources;

public interface Resourcesrepo extends JpaRepository<Resources,String> {

}
