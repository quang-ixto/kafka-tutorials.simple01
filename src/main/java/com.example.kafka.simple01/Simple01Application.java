package com.example.kafka.simple01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Simple01Application {

	public static void main(String[] args) {
		SpringApplication.run(Simple01Application.class, args);
	}

}
