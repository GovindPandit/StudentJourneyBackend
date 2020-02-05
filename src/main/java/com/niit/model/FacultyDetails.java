package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FacultyDetails")
public class FacultyDetails 
{
	@Id
	private String faculty_Id;
	
	@Column
	private String first_Name;
	private String last_Name;
	
	@Embedded
	private ContactDetails contactDetails;
	@Embedded
	private AddressDetails addressDetails;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "facultyDetails")
	private List<Student> students;

	public String getFaculty_Id() {
		return faculty_Id;
	}
	public void setFaculty_Id(String faculty_Id) {
		this.faculty_Id = faculty_Id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}
	public List<Student> getStudentDetails() {
		return students;
	}
	public void setStudentDetails(List<Student> studentDetails) {
		this.students = studentDetails;
	}

	
}
