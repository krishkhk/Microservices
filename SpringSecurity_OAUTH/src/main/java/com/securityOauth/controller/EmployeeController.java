package com.securityOauth.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.securityOauth.model.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/user/getEmployeesList",produces = "application/json")
	@ResponseBody
	
	public List<Employee> getEmployeesList(){
		
		List<Employee> employees=new ArrayList<>();
		
		Employee emp=new Employee();
		emp.setEmpId("21398");
		emp.setEmpName("krishna");
		employees.add(emp);
		
		
		return employees;
		
		
	}

}
