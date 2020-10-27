package com.hapo.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value = "/api/hello")
	public String hello() {
		return "Hello world~!";
	}
}
