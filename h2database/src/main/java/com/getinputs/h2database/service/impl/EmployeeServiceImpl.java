package com.getinputs.h2database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getinputs.h2database.dao.EmployeeDao;
import com.getinputs.h2database.model.Employee;
import com.getinputs.h2database.service.ManagerService;
import com.getinputs.h2database.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private ManagerService managerService;
	
	@Override
	public String saveEmployeeAndManager() {
		
		String response = "Employee and Manager Saved.";
		
		Employee employee = new Employee("Surya", 50000);
		employeeDao.save(employee);
		
		managerService.saveManager();
		
		return response;
	}

}
