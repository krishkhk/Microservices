package com.emp.produce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.emp.produce.model.Employee;

@RestController
public class EmpController {

	@RequestMapping(value="/employee",method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.FOUND)
	public Employee firstPage() {
		
		Employee emp=new Employee();
		emp.setEmpId("21398");
		emp.setName("Krishna");
		emp.setDesignation("Developer");
		emp.setSalary(15000);
		
		return emp;
		
	}

}
