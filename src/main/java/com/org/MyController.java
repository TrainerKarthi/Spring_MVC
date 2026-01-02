package com.org;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

	
	@RequestMapping("/hello")
	public String m1() {
		
		System.out.println("Hello Request Executed");
		
		return "test.jsp";
		
	}
}
