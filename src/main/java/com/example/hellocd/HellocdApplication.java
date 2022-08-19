package com.example.hellocd;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HellocdApplication {

	@RequestMapping("/hello")
	public String home() {
		return "Hello, World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HellocdApplication.class, args);
	}

}
