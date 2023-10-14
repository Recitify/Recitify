package com.racaron.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Categories;

@Repository
public interface CategoryDAO extends JpaRepository<Categories, Integer>{

	@Query("SELECT c FROM Categories c WHERE c.categories = ?1")
	List<Categories> searchByCategoryName(String name);
}
