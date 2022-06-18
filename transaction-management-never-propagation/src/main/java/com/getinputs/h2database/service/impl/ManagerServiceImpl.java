package com.getinputs.h2database.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.getinputs.h2database.dao.ManagerDao;
import com.getinputs.h2database.model.Manager;
import com.getinputs.h2database.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;

	@Override
	@Transactional(propagation = Propagation.NEVER)
	public String saveManager() {
		
		String response = "Manager Saved";
		
		Manager manager = new Manager("Suraj");
		managerDao.save(manager);
		
		System.out.println(response);
		return response;
	}
}
