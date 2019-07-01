package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringBootApplication {

	
	@GetMapping("/Name/{name}")
	public String getName1(@PathVariable String name) {
		System.out.println("getName api is called {}"+ name);
		// logger.info("message {}", this.message);
		return name;
		//return "<h1>Success</h1>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

}
