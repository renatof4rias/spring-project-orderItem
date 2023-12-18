package com.softelse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softelse.course.entities.User;
import com.softelse.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer Id) {
		Optional<User> obj = repository.findById(Id);
		return obj.get();
	}
	
	
}
