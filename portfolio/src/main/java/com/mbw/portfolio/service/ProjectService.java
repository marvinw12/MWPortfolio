package com.mbw.portfolio.service;

import java.util.List;

import com.mbw.portfolio.model.Project;
import com.mbw.portfolio.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

	private ProjectRepository projectRepository;

	@Autowired
	public ProjectService(ProjectRepository projectRepository){
		this.projectRepository = projectRepository;
	}

	public List<Project> findAll() {
		return (List<Project>) projectRepository.findAll();
	}

	public Project findById(long id) {

		return projectRepository.findById(id);
	}

	public Project save(Project project){
		return projectRepository.save(project);
	}
    
}
