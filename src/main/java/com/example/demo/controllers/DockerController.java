package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/")
public class DockerController {
	
	@GetMapping(value = "hello")
	private String sayeHello() {
		return "Hello";
	}

}
