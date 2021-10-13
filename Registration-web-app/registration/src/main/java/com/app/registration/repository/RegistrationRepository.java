package com.app.registration.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.registration.model.User;

public interface RegistrationRepository extends MongoRepository<User, Integer>{

	public User findByEmailId(String emailId);
	public User findByUserName(String userName);
}
