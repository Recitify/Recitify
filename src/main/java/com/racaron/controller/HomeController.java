package com.racaron.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.racaron.entity.Account;
import com.racaron.service.AccountService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/home")
public class HomeController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping("/index")
	public List<Account> test(@RequestParam(required = false) String username ) {
		
		return accountService.lstAccount();
	}
}
