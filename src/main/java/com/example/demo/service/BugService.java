package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bug;
import com.example.demo.repository.BugRepository;

@Service
public class BugService {
	@Autowired
   BugRepository bugRepository;

	public Iterable<Bug> getBugs() {
		return bugRepository.findAll();
	}

	public Optional<Bug> getBug(Integer id) {
		return bugRepository.findById(id);
	}

	public void saveBug(com.example.demo.entity.@Valid Bug bug) {
		bugRepository.save(bug);
		
	}

	public void deleteBug(Integer id) {
		bugRepository.deleteById(id);
		
	}

	public Bug updateBug(Bug bug) {
		return bugRepository.save(bug);
	}

}
