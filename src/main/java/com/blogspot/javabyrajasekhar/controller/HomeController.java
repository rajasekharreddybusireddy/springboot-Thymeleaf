package com.blogspot.javabyrajasekhar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private final String appName="Thymeleaf Example";

	@GetMapping("/")
	public String home(Model model,@RequestParam(name = "name",required = false,defaultValue = "Guest") String name) {
		
		model.addAttribute("title",appName);
		model.addAttribute("name",name);
		return "home";
		
	}
}
