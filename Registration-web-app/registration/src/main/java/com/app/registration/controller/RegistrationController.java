package com.app.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.model.User;
import com.app.registration.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		// e-mail unique
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			User userobj = service.fetchUserByEmailId(tempEmailId);
			if(userobj != null) {
				throw new Exception ("user with " + tempEmailId + " is already exist.");
			}
		}
		
		String tempUserName = user.getUserName();
		// username unique
		if(tempUserName != null && !"".equals(tempUserName)) {
			User userobj = service.fetchUserByUsername(tempUserName);
			if(userobj != null) {
				throw new Exception ("user with " + tempUserName + " is already exist.");
			}
		}
		
		
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
		
	}
}
