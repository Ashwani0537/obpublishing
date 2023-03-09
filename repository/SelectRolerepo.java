package com.spring.hr_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.hr_portal.entity.SelectRole;

@Repository
public interface SelectRolerepo  extends JpaRepository<SelectRole, Long>

{
	
 

}
