package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.dto.RegisterDTO;
import com.lti.entity.Register;
import com.lti.service.RegisterService;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String register(RegisterDTO registerDTO, Map<String, Object> model) {
		registerService.register(registerDTO);
		
		/*
		 * if you want to store any data whether it is data coming
		 * from the user or it is data pulled from the database,
		 * the easiest option is to store the data in a Map
		 */
		model.put("registrationDetails", registerDTO);
		return "/confirmation.jsp";
	}
	
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public String list(Map<String, Object> model) {
		List<Register> list = registerService.getRegisteredUsers();
		model.put("listOfUsers", list);
		return "/displayUsers.jsp";
	}

}
