package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity()
@Table(name = "CourseDetails")
public class CourseDetails 
{
	@Id
	private String course_Code;
	@Column
	private String course_Name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<SubjectDetails> subjects;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> students;
	
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public List<SubjectDetails> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<SubjectDetails> subjects) {
		this.subjects = subjects;
	}	
}
