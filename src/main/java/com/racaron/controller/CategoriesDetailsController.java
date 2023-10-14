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
@RequestMapping("/api/categoriesDetails")

public class CategoriesDetailsController {
//	@Autowired
//	CategoriesDetailsService cateDetailsService;
//	
//	@GetMapping
//	public List<CategoriesDetails> lstGetAll(@RequestParam(required = false) String catagoriesID){
//		if (catagoriesID != null) {
//			return cateDetailsService.searchByCategoryName(catagoriesID);
//		}
//		return cateDetailsService.getAll();
//	}

}
