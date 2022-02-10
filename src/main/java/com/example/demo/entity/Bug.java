package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Bug {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bug_id;
	private String email;
	private String ownwer;
	private String priority;
	private String status;
	private String owner_project;
	private String created_date;
	private String completion_date;
	private String description;
	private String attached_files;
	
	@OneToOne(mappedBy ="bug")
	Project project;
	
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Integer getBug_id() {
		return bug_id;
	}
	public void setBug_id(Integer bug_id) {
		this.bug_id = bug_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOwnwer() {
		return ownwer;
	}
	public void setOwnwer(String ownwer) {
		this.ownwer = ownwer;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner_project() {
		return owner_project;
	}
	public void setOwner_project(String owner_project) {
		this.owner_project = owner_project;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getCompletion_date() {
		return completion_date;
	}
	public void setCompletion_date(String completion_date) {
		this.completion_date = completion_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAttached_files() {
		return attached_files;
	}
	public void setAttached_files(String attached_files) {
		this.attached_files = attached_files;
	}
	
	

}
