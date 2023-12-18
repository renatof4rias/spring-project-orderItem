package com.softelse.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.softelse.course.entities.User;
import com.softelse.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired	
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null,"Arroz Doce", "ArrozDoce@gmail.com", "98765433", "1234567");
		User u2 = new User(null,"Pamonha Doce", "PamonhaDoce@gmail.com", "98451234", "6789456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
	
	
	
	
}
