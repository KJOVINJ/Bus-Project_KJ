package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.RegisterDao;
import com.lti.dto.RegisterDTO;
import com.lti.entity.Register;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	@Transactional
	public void register(RegisterDTO registerDTO) {
		Register register = new Register();
		register.setName(registerDTO.getName());
		register.setEmail(registerDTO.getEmail());
		register.setPassword(registerDTO.getPassword());
		
		registerDao.add(register);
	}
	
	public List<Register> getRegisteredUsers() {
		return registerDao.fetchAll();
	}
}
