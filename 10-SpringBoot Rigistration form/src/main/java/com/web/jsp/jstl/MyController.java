package com.web.jsp.jstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
public String home(ModelMap model,@ModelAttribute User user) {
		intializerformValue(model);
		model.addAttribute("users",user);
		
		return "registration2";

}
	public void intializerformValue(ModelMap model) {
		List<String> genders= new ArrayList<String>();
		genders.add("Male");
		genders.add("FeMale");
		model.addAttribute("genders",genders);
	
		
		List<String> courses= new ArrayList<String>();
		courses.add("java");
		courses.add(".Net");
		courses.add("html");
		courses.add("css");
		courses.add("javascript");
		courses.add("springBoot");
		model.addAttribute("courses",courses);
		
		List<String> batchs= new ArrayList<String>();
		batchs.add("Morning");
		batchs.add("Evening");
		model.addAttribute("batchs",batchs);
	}
	@RequestMapping("/result")
	public String formData(@ModelAttribute User user,ModelMap model) {
		
		model.addAttribute("users",user);
		return "result";
	}
}
