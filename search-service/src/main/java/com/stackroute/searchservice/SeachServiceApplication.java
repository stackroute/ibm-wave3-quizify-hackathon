package com.stackroute.searchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeachServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeachServiceApplication.class, args);
	}

}

