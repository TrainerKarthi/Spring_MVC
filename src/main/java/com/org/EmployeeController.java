package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.dto.Employee;

@Controller
public class EmployeeController {
	
	
	@RequestMapping("/emp_submit")
	public String acceptForm(@ModelAttribute Employee employee) {
		
		System.out.println(employee);
		System.out.println("Employee Submitted....");
		
		return "test.jsp";
		
	}
}
