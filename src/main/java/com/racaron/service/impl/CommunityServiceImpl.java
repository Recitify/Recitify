package com.racaron.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racaron.dao.CommunityDAO;
import com.racaron.entity.Community;
import com.racaron.service.CommunityService;

//ctrl + shift + o
@Service 
public class CommunityServiceImpl implements CommunityService{
	
	@Autowired
	CommunityDAO comDAO;
	
	@Override
	public List<Community> getAll() {
		// TODO Auto-generated method stub
		return comDAO.findAll();
	}

	@Override
	public List<Community> searchByCategoryName(String name) {
		// TODO Auto-generated method stub
		return comDAO.findByName(name);
	}

}
