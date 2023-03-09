package com.spring.hr_portal.service;

import java.util.List;
import java.util.Optional;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.spring.hr_portal.entity.Jobpublishing;
import com.spring.hr_portal.entity.SelectRole;
import com.spring.hr_portal.repository.JobPublishingRepo;

/**
 * @author 91783
 *
 */
@Service
public class JobPublishingService {
	@Autowired
	private JobPublishingRepo repo;
	
	
	
//	 public SelectRole findAllRole( SelectRole selectRole)
//	 {
//		 return repo.findAll(selectRole);
//	 }
//	
 
	
 	public Jobpublishing savejobpublishing(Jobpublishing jobpublishing ) {
		return repo.save(jobpublishing);
		
	}
 	public List<Jobpublishing >savejobpublishing(List<Jobpublishing> jobpublishing ) {
		return repo.saveAll(jobpublishing);
		
	}
 	public Jobpublishing  jobJobpublishingById(long id){
		return repo.findById(id).orElse(null);
	}
	
	public String deletejobpublishingById(long id)
	{
		repo.deleteById(id);
	return "Removed" +id;
		  
		
	}
		public Jobpublishing updatJobpublishing(Jobpublishing jobpublishing ){
 		Jobpublishing jobpub=repo.findById(jobpublishing .getId()).get();
		jobpub.setWorkingMode(jobpublishing .getWorkingMode());
		jobpub.setCtcTo(jobpublishing .getCtcTo());
		jobpub.setCtcMax(jobpublishing .getCtcMax());

		jobpub.setExpRequired(jobpublishing .getExpRequired());
		jobpub.setJobType(jobpublishing .getJobType());
		jobpub.setNoOfPosition(jobpublishing .getNoOfPosition());
		jobpub.setRequirement(jobpublishing .getRequirement());
		jobpub.setPublishingDate(jobpublishing .getPublishingDate());
		jobpub.setExpriyDate(jobpublishing .getExpriyDate());
		 
		return repo.save(jobpub);
	}
	
	

	
	
}
