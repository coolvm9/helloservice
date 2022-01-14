package com.fusion.helloservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloserviceApplication {
	private static int counter = 0;

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue ="World" ) String name){
		counter = counter+1;
		System.out.println("Test " + counter + " : " + String.format("Hello %s!", name));
		return String.format("Hello %s!", name);
	}
}
