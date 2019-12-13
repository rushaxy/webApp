package com.rusha.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppleApplication {
	
	@RequestMapping(path = "/home")
	public String home() {
		return "hello world!  --- home  ";
	}
	
	public static void main (String[] args) {
		SpringApplication.run(AppleApplication.class, args);
	}
}
