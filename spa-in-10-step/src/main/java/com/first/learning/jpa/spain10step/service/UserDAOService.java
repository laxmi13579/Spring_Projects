package com.first.learning.jpa.spain10step.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.first.learning.jpa.spain10step.entity.User;

//@Repository indicates somethings that intract with DB...
@Repository
@Transactional
public class UserDAOService {
	
	//EntityManager is use to manage the User data like to save and Retrive...
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public long insert(User User) {
		entityManager.persist(User);
		return User.getId();
		
	}
	
	

}
