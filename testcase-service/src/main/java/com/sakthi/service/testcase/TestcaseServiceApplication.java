package com.sakthi.service.testcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestcaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcaseServiceApplication.class, args);
	}

}
