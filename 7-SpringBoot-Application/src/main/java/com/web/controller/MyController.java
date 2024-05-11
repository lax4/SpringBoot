package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String main() {
		return "home";
	}
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/con")
	public String contact() {
		return "contact";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

}
