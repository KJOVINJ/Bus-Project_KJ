package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		
		//rest of the logic here
		return "welcome.jsp";
	}
	
}
