package com.racaron.service;

import java.util.List;

import com.racaron.entity.Community;

public interface CommunityService {

	public List<Community> getAll();
	
	public List<Community> searchByCategoryName(String name);
}
