package com.Sacral.com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.entity.User;
import com.Sacral.com.service.PolicyEndorsementService;

@RestController
public class PolicyEndorsementController {
	
	@Autowired
	private PolicyEndorsementService policyEndorsementService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestParam String username, @RequestParam String password) {
		Boolean result = policyEndorsementService.authenticateUser(username, password);
		if(result) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
	}
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@RequestParam String username, @RequestParam String password, 
			@RequestParam String email) {
		
		Boolean usernameExists = policyEndorsementService.existsByUsername(username);
		if(usernameExists) {
			return new ResponseEntity<>("Username already exists", HttpStatus.FORBIDDEN);
		}
		
		Boolean emailExists = policyEndorsementService.existsByEmail(email);
		if(emailExists) {
			return new ResponseEntity<>("Email already exists", HttpStatus.FORBIDDEN);
		}
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(bCryptPasswordEncoder.encode(password));
		user.setEmail(email);
		
		User savedUser = policyEndorsementService.policyEndorsementRepository.save(user);
		if(savedUser != null) {
			return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/grantAccess")
	public ResponseEntity<Object> grantAccessToMenu(@RequestParam String username, @RequestParam String password) {
		Boolean result = policyEndorsementService.grantAccessToMenu(username, password);
		if(result) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
	}

}