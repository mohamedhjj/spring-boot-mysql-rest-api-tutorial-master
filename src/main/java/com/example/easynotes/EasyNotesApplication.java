package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyNotesApplication {

	public static void main(String[] args) {
		//url tuto : https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}
