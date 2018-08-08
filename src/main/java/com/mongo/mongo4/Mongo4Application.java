package com.mongo.mongo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.mongo.mongo4.repository")
public class Mongo4Application {
	public static void main(String[] args) {
		SpringApplication.run(Mongo4Application.class, args);
	}
}
