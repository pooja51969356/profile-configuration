package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile(value = { "test" })
public class TestController {
	@GetMapping(value = "/test")
	public String getProfile() {
		return "test";
	}
	
}
