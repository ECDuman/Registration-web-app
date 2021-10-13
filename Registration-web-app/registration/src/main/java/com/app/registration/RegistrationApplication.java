package com.app.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.app.registration.repository.RegistrationRepository;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableMongoRepositories
public class RegistrationApplication implements CommandLineRunner{
	
	@Autowired
	private RegistrationRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
