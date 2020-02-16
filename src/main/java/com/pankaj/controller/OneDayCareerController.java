package com.pankaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.model.Career;
import com.pankaj.service.OneDayCareerService;

@RestController
public class OneDayCareerController {
	
	@Autowired
	OneDayCareerService oneDayCareerService;
	
	@RequestMapping(value="/{id}")
	public Career getOneDayCareerById(@PathVariable("id") int id) {
		return oneDayCareerService.getOneDayCareer(id);
	}

}
