package com.first.learning.jpa.spain10step;

import java.util.List;
import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.first.learning.jpa.spain10step.entity.User;
import com.first.learning.jpa.spain10step.service.UserDAOService;
import com.first.learning.jpa.spain10step.service.UserRepository;


@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
//	@Autowired
//	private UserDAOService userDAOService;

	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void run(String... args) throws Exception {
		User user = new User("laxmi","admin");
		User user2 = new User("logan","user");
		//long insert = userDAOService.insert(user);
		userRepository.save(user);
		userRepository.save(user2);
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User with Id One value"+userWithIdOne);
		
		List<User> users=userRepository.findAll();
		log.info("details of all users"+users);
	}

}
