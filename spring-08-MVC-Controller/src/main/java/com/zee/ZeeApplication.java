package com.zee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class ZeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeeApplication.class, args);
	}

}
