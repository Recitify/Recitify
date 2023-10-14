package com.racaron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.racaron.entity.Categories;
import com.racaron.service.CategoryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	CategoryService cateService;
	
	@GetMapping("/a")
	public String a () {
		return "A";
	}
	
	@GetMapping
	public List<Categories> lstGetAll(){
		return cateService.getAll();
	}
}
