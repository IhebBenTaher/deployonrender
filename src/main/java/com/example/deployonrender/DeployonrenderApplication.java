package com.example.deployonrender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployonrenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployonrenderApplication.class, args);
	}
	@GetMapping("/hello")
	public String helloWorld(){
		return "hello world2!";
	}
}
