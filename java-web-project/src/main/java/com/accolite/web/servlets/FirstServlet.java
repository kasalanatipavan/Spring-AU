package com.accolite.web.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accolite.web.models.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FirstServlet extends HttpServlet{
	@Override
	protected void  doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		ObjectMapper mapper=new ObjectMapper();
		User myUser =new User();
		myUser.setId(123);
		myUser.setSalary(100000);
		String str=mapper.writeValueAsString(myUser);
		response.getWriter().write(str);
		//response.getWriter().write("This response is from Servlet!");
		
	}
	

}
