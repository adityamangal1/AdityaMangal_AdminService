package com.example.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.adminservice.proxy")
public class AdityaamangalAdminserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdityaamangalAdminserviceApplication.class, args);
	}

}

