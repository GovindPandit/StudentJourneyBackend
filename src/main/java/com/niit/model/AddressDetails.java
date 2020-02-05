package com.niit.model;

import javax.persistence.Embeddable;

@Embeddable
public class AddressDetails
{
	private String address_Line;
	private String street;
	private String landmark;
	private String city;
	private String state;
	private int zipcode;
	
	public String getAddress_Line() {
		return address_Line;
	}
	public void setAddress_Line(String address_Line) {
		this.address_Line = address_Line;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
