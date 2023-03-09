package com.spring.hr_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

import com.spring.hr_portal.entity.Jobpublishing;
 @Repository
public interface JobPublishingRepo extends JpaRepository<Jobpublishing, Long> {

	 
	

	
	
}
