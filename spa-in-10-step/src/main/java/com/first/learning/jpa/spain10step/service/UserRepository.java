package com.first.learning.jpa.spain10step.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.learning.jpa.spain10step.entity.User;

//parameter are Entiry:User and Primary key:Long
public interface UserRepository extends JpaRepository<User,Long>{

}
