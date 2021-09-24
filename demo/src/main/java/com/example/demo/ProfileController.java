package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile(value = { "dev" })
public class ProfileController {

	@GetMapping(value = "/dev")
	public String getProfile() {
		return "dev";
	}
	
}
