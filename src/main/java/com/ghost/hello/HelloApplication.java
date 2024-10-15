package com.ghost.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	private String myEnvVar;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
