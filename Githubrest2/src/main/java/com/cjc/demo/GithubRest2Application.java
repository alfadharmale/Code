package com.cjc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
@EnableJpaRepositories("com.cjc.daoi")
@EntityScan("com")
@SpringBootApplication(scanBasePackages="com")
public class GithubRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(GithubRest2Application.class, args);
		System.out.println("in main"); 
	}
	
}
