package com.prac.practical_programming;

import org.springframework.boot.SpringApplication;

public class TestPracticalProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.from(PracticalProgrammingApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
