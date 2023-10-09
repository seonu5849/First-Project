package org.zerock.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CafeMoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafeMoaApplication.class, args);
	}

}
