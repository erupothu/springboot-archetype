package com.nextguru.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextguru.model.Employee;

@RestController
public class SpringBootController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getDetails() {
		
		Employee emp = new Employee();
		emp.setId("7182");
		emp.setName("Harish");
		
		return emp;
	}

}
