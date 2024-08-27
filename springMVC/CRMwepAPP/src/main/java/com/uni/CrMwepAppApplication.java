package com.uni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.uni")
public class CrMwepAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrMwepAppApplication.class, args);
	}

}
