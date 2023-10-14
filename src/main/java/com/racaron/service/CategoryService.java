package com.racaron.service;

import java.util.List;

import com.racaron.entity.Categories;

public interface CategoryService {
	public List<Categories> getAll();
	public List<Categories> searchByCategoryName(String name);
}
