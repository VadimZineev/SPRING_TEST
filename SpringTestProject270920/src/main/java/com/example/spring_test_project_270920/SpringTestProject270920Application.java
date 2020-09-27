package com.example.spring_test_project_270920;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringTestProject270920Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestProject270920Application.class, args);
	}

}
