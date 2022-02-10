package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;
@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
    
    @GetMapping("/project")
	Iterable<Project> getProjects() {
	      return projectService.getProjects();
	 }
    
    @GetMapping("/project/{id}")
    Optional<Project> getProjects(@PathVariable("id") Integer id){
			return projectService.getProject(id);
	}
	
	@PostMapping("/project")
	void createProject(@RequestBody Project project) {
		
		projectService.saveProject(project);
	}
}
