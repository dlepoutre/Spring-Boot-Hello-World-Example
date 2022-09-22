package com.reytech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	private Singleton singleton;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
