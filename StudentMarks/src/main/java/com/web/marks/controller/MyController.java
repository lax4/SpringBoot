package com.web.marks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/")
public String home() {
	return "student";
}
	@RequestMapping("/result")
	public String studentMarks(@RequestParam int sid,@RequestParam String fname,@RequestParam String lname,@RequestParam double sub1,@RequestParam double sub2,@RequestParam double sub3,ModelMap model) {
		model.put("key1", sid);
		model.put("key2",fname );
		model.put("key3", lname);
		model.put("key4", sub1);
		model.put("key5", sub2);
		model.put("key6", sub3);
		
		String fullName=fname +" " +lname;
		model.put("key7", fullName);
		double total ,percentage ;
		total=sub1+sub2+sub3;
		percentage = (total / 300) * 100;
		model.put("key8", total);
		 model.put("key9", percentage + "%");
		 
		 String grade;
		if(	percentage>=70) {
			grade= "A grade";
		}
		else if(percentage>=60){
			grade="B grade";
		}
		else if(percentage>=50) {
			grade= "C grade";
		}
		else {
			grade= "fail";
		}
		
		model.put("key10", grade);
		return "result";
	}
	
}
