package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student 
{
	@Id
	private String registration_Number;
	@Column
	private String student_Id;
	private String first_Name;
	private String last_Name;
	
	@Embedded
	private ContactDetails contactDetails;
	@Embedded
	private AddressDetails addressDetails;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "students")
	private List<CourseDetails> courseDetails;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<FacultyDetails> facultyDetails;
	
	public List<FacultyDetails> getFacultyDetails() {
		return facultyDetails;
	}

	public void setFacultyDetails(List<FacultyDetails> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	public List<CourseDetails> getCourseDetails() {
		return courseDetails;
	}
	
	public void setCourseDetails(List<CourseDetails> courseDetails) {
		this.courseDetails = courseDetails;
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
	public String getRegistration_Number() {
		return registration_Number;
	}
	public void setRegistration_Number(String registration_Number) {
		this.registration_Number = registration_Number;
	}
	public String getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(String student_Id) {
		this.student_Id = student_Id;
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
	
	
}
