package com.getinputs.h2database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinputs.h2database.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
