package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "evenorodd";
	}
	@RequestMapping("/res")
	public String evenOrOdd(@RequestParam int number,ModelMap model) {
		model.put("key1", number);
		if(number%2==0) {
			model.put("key2","evennumber");
		}
			else {
				model.put("key3","oddnumber");
			}
		return "result";
		
		
		}

}
