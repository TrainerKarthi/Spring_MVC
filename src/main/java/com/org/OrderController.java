package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dto.Order;

@Controller
public class OrderController {

	
	@RequestMapping("/my_orders")
	public ModelAndView viewOrders() {
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1, "Laptop", 100000));
		orders.add(new Order(2, "Mobile", 80000));
		orders.add(new Order(3, "Watch", 90000));
		orders.add(new Order(4, "Air Pods", 40000));
		orders.add(new Order(5, "Ring", 200000));
		
		ModelAndView mav = new ModelAndView("orders.jsp");
		
		mav.addObject("orders", orders);
		
		return mav;
	}
}
