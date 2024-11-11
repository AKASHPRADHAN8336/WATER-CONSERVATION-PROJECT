package com.example.WaterUsageService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WaterUsageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterUsageServiceApplication.class, args);
	}

}
