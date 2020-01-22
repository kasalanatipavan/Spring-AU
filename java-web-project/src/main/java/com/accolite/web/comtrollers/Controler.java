package com.accolite.web.comtrollers;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accolite.web.models.User;

@Controller
@RequestMapping("api")
public class Controler {
	
	private ArrayList<User> users;
	
	@RequestMapping(value="/hii", method=RequestMethod.GET)
	public @ResponseBody String sayHi() {
		return "hello his is from first spring controller";
	}
	
	@RequestMapping(value="user")
	public @ResponseBody User sendUser() {
		return new User();
		
	}
	
	@RequestMapping(value="anotherUser", method=RequestMethod.POST)
	public @ResponseBody User getAndSendUser(@RequestBody User user) {
		return user;
	}
	
	@RequestMapping
	public String getEmployeePage() {
		return "EmployeeList";
	}

	public @ResponseBody User getUserById(@RequestParam int id) {
		return users.stream().filter(user->user.getId()==id).findFirst().get();
	}
	
	public Controler() {
		users =new ArrayList();
		User u1=new User();
		u1.setId(43);
		u1.setSalary(20000);
		users.add(u1);
	}
}


