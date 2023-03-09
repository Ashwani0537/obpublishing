package com.spring.hr_portal.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
 
@Entity
public class SelectRole {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	 private long SelectRole_id;
	 private String selectRole;
	 
	 

	public long getSelectRole_id() {
			return SelectRole_id;
		}

		public void setSelectRole_id(long selectRole_id) {
			SelectRole_id = selectRole_id;
		}

		 
	public String getSelectRole() {
		return selectRole;
	}

	public void setSelectRole(String selectRole) {
		this.selectRole = selectRole;
	}
	
	
	 

}
