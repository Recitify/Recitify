package com.racaron.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.racaron.entity.Community;

@Repository
public interface CommunityDAO extends JpaRepository<Community, Integer>{

	@Query("SELECT c FROM  Community c WHERE c.teamName = ?1")
	public List<Community> findByName(String name);
	
}
