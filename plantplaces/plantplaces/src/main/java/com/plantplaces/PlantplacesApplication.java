package com.plantplaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PlantplacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantplacesApplication.class, args);
	}
}
