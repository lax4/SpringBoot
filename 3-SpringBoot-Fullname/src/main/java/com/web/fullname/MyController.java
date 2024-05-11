package com.web.fullname;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("home")
	public String home() {
		return "fullname";
	}
	@RequestMapping("/res")
	public String fullname(@RequestParam String fname,@RequestParam String lname,ModelMap model) {	//validation//
		model.put("key1", fname);
		model.put("key2", lname);
		String fullname=fname +" " +lname;
		model.put("fn", fullname);
		return "result";
	}
}
