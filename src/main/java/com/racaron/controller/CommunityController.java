package com.racaron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.racaron.entity.Community;
import com.racaron.service.CommunityService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/community")
public class CommunityController {

	@Autowired
	CommunityService comService;
	
	@GetMapping
	public List<Community> lstGetAll(@RequestParam(required = false) String TeamName){
		if (TeamName != null) {
			return comService.searchByCategoryName(TeamName);
		}
		return comService.getAll();
	}
	
}
