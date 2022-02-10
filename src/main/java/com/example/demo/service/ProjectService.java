package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.repository.ProjectRepository;
@Service
public class ProjectService {
	@Autowired
	   ProjectRepository projectRepository;


	public Iterable<Project> getProjects() {
		return projectRepository.findAll();
	}

	public Optional<Project> getProject(Integer id) {
		return projectRepository.findById(id);
	}

	public void saveProject(Project project) {
		projectRepository.save(project);
		
	}

}
