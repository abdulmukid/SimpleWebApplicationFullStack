package com.misba.springboot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misba.springboot.model.Employee;
import com.misba.springboot.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/all-employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	

}
