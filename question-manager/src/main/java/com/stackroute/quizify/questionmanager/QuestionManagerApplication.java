package com.stackroute.quizify.questionmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class QuestionManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionManagerApplication.class, args);
	}

}

