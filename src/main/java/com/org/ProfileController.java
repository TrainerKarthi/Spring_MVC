package com.org;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

//	@RequestMapping("/sendData")
//	public String sendData(HttpServletRequest request) {
//		String name ="Ramana";
//		
//		request.setAttribute("name", name);
//		
//		return "profile.jsp";
//	}
	
	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		
		String name="LAVAN";
		
		ModelAndView mav = new ModelAndView("profile.jsp");
		mav.addObject("name", name);
		
		return mav;
	}
}
