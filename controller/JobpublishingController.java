 package com.spring.hr_portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hr_portal.entity.Jobpublishing;
import com.spring.hr_portal.entity.SelectRole;
import com.spring.hr_portal.service.JobPublishingService;
@RestController
 
public class JobpublishingController {
   
	
	@Autowired
	private  JobPublishingService jobPublishingService;
	
//	@GetMapping("/findAllRole")
//	 public SelectRole findAllRole( SelectRole selectRole)
//	 {
//		 return jobPublishingService.findAllRole(selectRole);
//	 }
	
	@PostMapping("/addjobpublishing")
	public Jobpublishing addjobpublishing( @RequestBody Jobpublishing jobpublishing)
	{ 
		return jobPublishingService.savejobpublishing(jobpublishing);
	}
	
	@PostMapping("/addAlljobpublishing") 

	public List<Jobpublishing> addAlljobpublishing(@RequestBody List<Jobpublishing>jobpublishing)
	{
		return  jobPublishingService.savejobpublishing(jobpublishing);
	}
	
	@GetMapping("/JobpublishingById/{id}")
	public Jobpublishing JobpublishingById(@PathVariable("id")Long id)
	{
		return jobPublishingService.jobJobpublishingById(id);
		
	}
	
	
	@DeleteMapping("/DeletePublishedJobById/{id}")
	public String deletejobpublishingById (@PathVariable("id") Long id)
	{
		return jobPublishingService .deletejobpublishingById(id);
 	}
	

	@PutMapping("/PublpdateshedJobById/{id}")
	public Jobpublishing   updatJobpublishing (@PathVariable("id") Long id,  @RequestBody  Jobpublishing  jobpublishing)
	{
	 return jobPublishingService .updatJobpublishing(jobpublishing);
 	}
	
	
}
