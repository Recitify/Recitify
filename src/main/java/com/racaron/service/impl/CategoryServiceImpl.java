package com.racaron.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racaron.dao.CategoryDAO;
import com.racaron.entity.Categories;
import com.racaron.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDAO cateDAO;
	
	@Override
	public List<Categories> getAll() {
		// TODO Auto-generated method stub
		return cateDAO.findAll();
	}

	@Override
	public List<Categories> searchByCategoryName(String name) {
		// TODO Auto-generated method stub
		return cateDAO.searchByCategoryName(name);
	}
	

	
}
