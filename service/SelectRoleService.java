package com.spring.hr_portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hr_portal.entity.SelectRole;
import com.spring.hr_portal.repository.SelectRolerepo;

@Service
public class SelectRoleService {
	
	@Autowired
	 private SelectRolerepo rolerepo;
	
	
 	 public List<SelectRole> findAllRole()
 	 {
 		return rolerepo.findAll();
 	 }


	 
 	
}
