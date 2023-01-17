package com.aws.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsDemoCodepipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDemoCodepipelineApplication.class, args);
	}

	@GetMapping(value = "/hello/{name}")
	public String greet(@PathVariable("name")String name){
		return "hello "+name;
	}

}
