package com.sakthi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppGatewayApplication.class, args);
	}

}
