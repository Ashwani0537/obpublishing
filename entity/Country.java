package com.spring.hr_portal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
	
	@Id
	private Long country_id;
	
	private String Country_short_name;
	 
	private String country_name;

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public String getCountry_short_name() {
		return Country_short_name;
	}

	public void setCountry_short_name(String country_short_name) {
		Country_short_name = country_short_name;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	
	    
	
	
}
