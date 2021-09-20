package com.asu.application.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asu.application.model.Employee;
import com.asu.application.repository.EmployeeRepository;


@RestController
public class DefaultController {
	@GetMapping("/test")
	public String greet() {
		return "Hi";
	}

	@GetMapping("/getbyid")
	public Employee getEmployeeByID(@RequestParam Long id) {
		return EmployeeRepository.repo.get(id);
		
	}
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee e) {
		EmployeeRepository.repo.put(e.getEmp_id(), e);
		return "Added "+e.toString();		
		
	}
	
	@GetMapping("/findbyname")
	public String findByName(@RequestParam String name) {
		 List<Employee> emp_list =  EmployeeRepository.findByName(name);
		StringBuilder sb = new StringBuilder();
		emp_list.stream().map(e -> e.getName()).forEach(e -> sb.append(e.toString() +" , " ));
		
		return sb.toString();
		
	
	}
	
	
	
	
	//user name and id
	//Add new employee
	
	
	
	

}
