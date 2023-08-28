package com.Sacral.com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Sacral.com.entity.User;
import com.Sacral.com.repository.PolicyEndorsementRepository;

@Service
public class PolicyEndorsementService {
	
	@Autowired
	private PolicyEndorsementRepository policyEndorsementRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public Optional<User> findByUsername(String username) {
		return policyEndorsementRepository.findByUsername(username);
	}
	
	public Boolean existsByUsername(String username) {
		return policyEndorsementRepository.existsByUsername(username);
	}
	
	public Boolean existsByEmail(String email) {
		return policyEndorsementRepository.existsByEmail(email);
	}
	
	public Boolean authenticateUser(String username, String password) {
		User user = policyEndorsementRepository.findByUsername(username).orElse(null);
		if(user != null) {
			return bCryptPasswordEncoder.matches(password, user.getPassword());
		}
		return false;
	}
	
	public Boolean grantAccessToMenu(String username, String password) {
		Boolean result = authenticateUser(username, password);
		if(result) {
			//Provide access to the Policy Endorsement Menu
			return true;
		}
		return false;
	}

}