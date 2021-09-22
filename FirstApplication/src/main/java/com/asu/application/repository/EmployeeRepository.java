package com.asu.application.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.asu.application.model.Employee;

public class EmployeeRepository {
	public static HashMap<Long, Employee> repo  = new HashMap<>();

	public static List<Employee> findByName(String name) { 
		List<Employee> list=new ArrayList<>();
		for(Long key : repo.keySet()) {
			if(repo.get(key).getName().toLowerCase().contains(name.toLowerCase())) {
				list.add(repo.get(key));
			}
		}
		
		return list;
	}
	
	
	
	
}
