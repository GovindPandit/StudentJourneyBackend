package com.niit.model;

import javax.persistence.Embeddable;

@Embeddable
public class ContactDetails 
{
	private String email;
	private String mobile;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	
}
