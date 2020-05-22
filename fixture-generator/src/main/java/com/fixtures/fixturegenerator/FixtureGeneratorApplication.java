package com.fixtures.fixturegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FixtureGeneratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(FixtureGeneratorApplication.class, args);

		//read list of teams from a file and add to a hashMap?
		//pass it to FixturesService
	}

}
