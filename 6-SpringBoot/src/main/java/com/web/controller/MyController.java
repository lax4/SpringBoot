package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "login";

	}

	@RequestMapping("/ans")
	public String loginForm(@RequestParam String uname,@RequestParam String pwd,ModelMap model) {
		model.put("key1", uname);
		model.put("key2", pwd);
		if(uname.equals("Lakshmi") && pwd.equals("1912")) {
			model.put("key3", "login successful");
		}	
		else if(uname.equals("")){
			model.put("key4", "user name can't empty..");
		}
	    else if(pwd.equals("")){
	    	model.put("key5", "password can't empty..");
	    }

	    else{
	    	model.put("key6", "invalid username and password");
	}return"answer";

}

}
