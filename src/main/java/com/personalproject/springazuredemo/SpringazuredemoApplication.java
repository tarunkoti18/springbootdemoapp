package com.personalproject.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringazuredemoApplication {

	@GetMapping(value = "/message")
	public String message()
	{
		return "Congrats ! you app developed sucessfully in Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringazuredemoApplication.class, args);
	}

}
