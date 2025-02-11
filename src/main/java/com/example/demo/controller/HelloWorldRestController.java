package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldRestController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World..";
	}
}
