package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

	
	@RequestMapping("/hello")
	public String m1() {
		
		System.out.println("Hello Request Executed");
		
		return "test.jsp";
		
	}
	
	
	@RequestMapping("/hi")
	public String hiRequest(@RequestParam("id") int studentId
							,@RequestParam("name") String studentName) {
		
		System.out.println("Hii request triggered and Id: "+studentId);
		System.out.println("Hii request triggered and name: "+studentName);
		
		return "test.jsp";
	}
}
