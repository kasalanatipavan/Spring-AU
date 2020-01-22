package com.accolite.web.comtrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accolite.web.models.User;

//@RestController
public class SecondController {
	@RequestMapping(value="/hii", method=RequestMethod.GET)
	public @ResponseBody String sayHi() {
		return "hello his is from first spring controller";
	}
	
	@RequestMapping(value="user")
	public @ResponseBody User sendUser() {
		return new User();
	}	
}
