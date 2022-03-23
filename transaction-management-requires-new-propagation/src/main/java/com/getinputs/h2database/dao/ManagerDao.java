package com.getinputs.h2database.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinputs.h2database.model.Manager;

public interface ManagerDao extends JpaRepository<Manager, Integer> {

}
