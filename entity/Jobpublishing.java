package com.spring.hr_portal.entity;

 
 import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Jobpublishing {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
  
//private String selectRole;

//Mapping the column of this table
@OneToMany
//Adding the name
@JoinColumn(name = "SelectRole_Id" ,referencedColumnName ="id")

 private List<SelectRole> role;

private String jobType;

private String workingMode;
private  Integer noOfPosition;
private Integer  expRequired;
private String requirement;
private Integer ctcTo;
private Integer ctcMax;
private  String publishingDate ; 
private String expriyDate;





public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public List<SelectRole> getRole() {
	return role;
}
public void setRole(List<SelectRole> role) {
	this.role = role;
}
public String getJobType() {
	return jobType;
}
public void setJobType(String jobType) {
	this.jobType = jobType;
}
public String getWorkingMode() {
	return workingMode;
}
public void setWorkingMode(String workingMode) {
	this.workingMode = workingMode;
}
public Integer getNoOfPosition() {
	return noOfPosition;
}
public void setNoOfPosition(Integer noOfPosition) {
	this.noOfPosition = noOfPosition;
}
public Integer getExpRequired() {
	return expRequired;
}
public void setExpRequired(Integer expRequired) {
	this.expRequired = expRequired;
}
public String getRequirement() {
	return requirement;
}
public void setRequirement(String requirement) {
	this.requirement = requirement;
}
public Integer getCtcTo() {
	return ctcTo;
}
public void setCtcTo(Integer ctcTo) {
	this.ctcTo = ctcTo;
}
public Integer getCtcMax() {
	return ctcMax;
}
public void setCtcMax(Integer ctcMax) {
	this.ctcMax = ctcMax;
}
public String getPublishingDate() {
	return publishingDate;
}
public void setPublishingDate(String publishingDate) {
	this.publishingDate = publishingDate;
}
public String getExpriyDate() {
	return expriyDate;
}
public void setExpriyDate(String expriyDate) {
	this.expriyDate = expriyDate;
}


public Jobpublishing() {
	super();
	// TODO Auto-generated constructor stub
}
public Jobpublishing(Long id, List<SelectRole> role, String jobType, String workingMode, Integer noOfPosition,
		Integer expRequired, String requirement, Integer ctcTo, Integer ctcMax, String publishingDate,
		String expriyDate) {
	super();
	this.id = id;
	this.role = role;
	this.jobType = jobType;
	this.workingMode = workingMode;
	this.noOfPosition = noOfPosition;
	this.expRequired = expRequired;
	this.requirement = requirement;
	this.ctcTo = ctcTo;
	this.ctcMax = ctcMax;
	this.publishingDate = publishingDate;
	this.expriyDate = expriyDate;
}
@Override
public String toString() {
	return "Jobpublishing [id=" + id + ", role=" + role + ", jobType=" + jobType + ", workingMode=" + workingMode
			+ ", noOfPosition=" + noOfPosition + ", expRequired=" + expRequired + ", requirement=" + requirement
			+ ", ctcTo=" + ctcTo + ", ctcMax=" + ctcMax + ", publishingDate=" + publishingDate + ", expriyDate="
			+ expriyDate + "]";
}



 
 


}
