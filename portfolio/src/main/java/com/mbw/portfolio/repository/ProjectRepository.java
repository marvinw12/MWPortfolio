package com.mbw.portfolio.repository;
import java.util.List;

import com.mbw.portfolio.model.Project;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

    List<Project> findAll();
    Project findById(long id);
}