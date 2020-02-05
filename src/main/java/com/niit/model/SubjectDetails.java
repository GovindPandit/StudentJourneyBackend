package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SubjectDetails")
public class SubjectDetails
{
	@Id
	private String subject_Code;
	@Column
	private String subject_Name;
	private float duration;
	private float fee_Amount;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "subjects")
	private List<CourseDetails> courseDetails;
	
	
	public String getSubject_Code() {
		return subject_Code;
	}
	public void setSubject_Code(String subject_Code) {
		this.subject_Code = subject_Code;
	}
	public String getSubject_Name() {
		return subject_Name;
	}
	public void setSubject_Name(String subject_Name) {
		this.subject_Name = subject_Name;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public float getFee_Amount() {
		return fee_Amount;
	}
	public void setFee_Amount(float fee_Amount) {
		this.fee_Amount = fee_Amount;
	}
}
