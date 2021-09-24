package com.sakthi.service.testcase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakthi.service.testcase.entity.Testcase;
import com.sakthi.service.testcase.service.TestcaseService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/tc")
@Slf4j
public class TestcaseController {

	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private TestcaseService userService;
	
	@GetMapping("/")
	public ResponseEntity<Object> checkService() {
		String message = appName + " is working.. <br></br><b>HAPPY CODING!!!</b>";
		log.info("CALLED :: checkService");
		return ResponseEntity.ok().body(message);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Object> getAllUsers() {
		List<Testcase> users = userService.getAllUsers();
		log.info("Found {} users...");
		return ResponseEntity.ok().body(users);
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveUser(@RequestBody Testcase user) {
		userService.saveUser(user);
		log.info("Used saved successfully...");
		return ResponseEntity.ok().body(user);
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Object> delete(@PathVariable Long userId) {
		userService.delete(userId);
		log.info("Used deleted successfully...");
		return ResponseEntity.ok().body("User deleted successfully...");
	}
	
}
