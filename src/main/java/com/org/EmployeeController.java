package com.org;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dto.Employee;

@Controller
public class EmployeeController {
	
	
	@RequestMapping("/emp_submit")
	public String acceptForm(@ModelAttribute Employee employee) {
		
		System.out.println(employee);
		System.out.println("Employee Submitted....");
		
		return "test.jsp";
		
	}
	

	@RequestMapping("/save_emp")
	public String saveForm(@ModelAttribute Employee employee) {
		
//		System.out.println(employee);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		
		System.out.println("Employee Submitted....");
		
		return "test.jsp";
		
	}
	
	
	@RequestMapping("/form")
	public String sendRegistrationForm() {
		return "employee_form.jsp";
	}
	
	@RequestMapping("/View_Employees")
	public ModelAndView viewEmployees() {
		
//		System.out.println(employee);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String hql ="SELECT s FROM Employee s";
		
		Query query = entityManager.createQuery(hql);
		
		List<Employee> list = query.getResultList();
		
		ModelAndView mav = new ModelAndView("view_employees.jsp");
		
		mav.addObject("employees", list);
		return mav;
		
	}
}
