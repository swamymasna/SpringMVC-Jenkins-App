package com.swamy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String showWelcomePage() {
		return "WelcomePage";
	}
	
	@GetMapping("/home")
	public String showHomePage() {
		return "HomePage";
	}
}
