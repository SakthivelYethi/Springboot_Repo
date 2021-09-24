package com.sakthi.service.testcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.service.testcase.entity.Testcase;
import com.sakthi.service.testcase.repository.TestcaseRepository;


@Service
public class TestcaseService {

	@Autowired
	private TestcaseRepository userRepository;
	
	public List<Testcase> getAllUsers() {
		return userRepository.findAll();
	}

	public Testcase saveUser(Testcase user) {
		return userRepository.save(user);
	}

	public void delete(Long userId) {
		userRepository.deleteById(userId);
	}
}
