package com.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Entity;

@RestController
public class BajajController 
{

	
	@PostMapping("bfhl")
	public Entity getUser(@ModelAttribute Entity user)
	{
		if(user != null)
		{
			user.setIs_success(true);
		}
		
		return user;
	}
	
}
