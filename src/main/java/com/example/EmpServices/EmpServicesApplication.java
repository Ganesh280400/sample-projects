package com.example.EmpServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.controllers", "com.service" })
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("com.repo")
@EntityScan("com.dto")
public class EmpServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServicesApplication.class, args);
	}

}
