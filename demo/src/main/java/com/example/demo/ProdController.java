package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile(value = { "prod" })
public class ProdController {
	@GetMapping(value = "/prod")
	public String getProfile() {
		return "prod";
	}
}
