package com.agileprojectmanagement.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agileprojectmanagement.projectmanagement.entities.Projects;

public interface Projectsrepo extends JpaRepository<Projects,Long> {
        
}
