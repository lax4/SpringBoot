package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "Bill";
	}
	@RequestMapping("/res")
	public String dMartInvoice(@RequestParam int cid,@RequestParam String cname,@RequestParam long mno,@RequestParam String pname,@RequestParam long mno1,@RequestParam int price,@RequestParam int quantity,ModelMap model ) {
		model.put("key1",cid);
		model.put("key2",cname );
		model.put("key3",mno);
		model.put("key4",pname);
		model.put("key5",mno1);
		model.put("key6",price);
		model.put("key7",quantity);
		double discount,total;
		total=price*quantity;
		model.put("key8", total);
		if(total<5000) {
			discount=(total*10/100);
		}
		else if(total<1000) {
			discount=(total*15/100);
		}
		
		else {
			discount=(total*20/100);
			
			
		}
			
		double invoice=(total-discount);
		model.put("key9", invoice);
		return "Result";
	}

}
