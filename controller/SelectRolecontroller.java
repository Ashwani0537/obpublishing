package com.spring.hr_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hr_portal.entity.SelectRole;
import com.spring.hr_portal.service.SelectRoleService;

@RestController
public class SelectRolecontroller {

	
	@Autowired
	private SelectRoleService roleService;
	@GetMapping("/findAllRole")
	 public List<SelectRole> findAllRole()
	 {
		 return roleService.findAllRole();
		 }
}
