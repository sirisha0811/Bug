package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bug;
import com.example.demo.service.BugService;
@RestController
public class BugController {

	@Autowired
	BugService bugService;
    
    @GetMapping("/bug")
	Iterable<Bug> getBugs() {
	      return bugService.getBugs();
	 }
    
    @GetMapping("/bug/{id}")
    Optional<Bug> getBugs(@PathVariable("id") Integer id){
			return bugService.getBug(id);
	}
	
	@PostMapping("/bug")
	void createBug(@RequestBody Bug bug) {
		
		bugService.saveBug(bug);
	}
	
	@DeleteMapping("/bug/{id}")
	void deleteBug(@PathVariable("id") Integer id) {
		bugService.deleteBug(id);
	}
	@PutMapping("/bug")
	public Bug updateBug (@RequestBody Bug  bug) {
		return bugService.updateBug (bug);

	}
	
	
	
	
	
	
}