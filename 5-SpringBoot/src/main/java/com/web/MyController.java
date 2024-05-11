package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "prime";
	}
	@RequestMapping("/r")
	public String PrimeNumber(@RequestParam int num,ModelMap model) {
		model.put("key1",num);
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			model.put("key3", "primenumber");
		}
		else {
			model.put("key4", "not a primenumber");
		}
		model.put("key", count);
		return "result";
	}

}
