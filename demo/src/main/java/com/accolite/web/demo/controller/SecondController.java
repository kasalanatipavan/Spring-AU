package com.accolite.web.demo.controller;

import java.util.ArrayList;

import org.hibernate.validator.internal.engine.valueextraction.ArrayElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.web.demo.models.Users;
import com.accolite.web.demo.services.UserServices;

@RestController
public class SecondController {
	private final Users userService = new Users();
	
	@GetMapping("user/{id}")
	public int getUserById(@PathVariable int id)
	{
		return userService.getId();
	}
	
	
}