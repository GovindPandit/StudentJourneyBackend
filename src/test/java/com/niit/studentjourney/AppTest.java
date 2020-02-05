package com.niit.studentjourney;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.niit.dao.SubjectDAO;
import com.niit.daoimpl.SubjectDAOImpl;
import com.niit.model.SubjectDetails;

public class AppTest 
{
	SubjectDAO subjectDAO=new SubjectDAOImpl();
	
	@Test
	public void add()
	{
		SubjectDetails subjectDetails=new SubjectDetails();
		subjectDetails.setSubject_Code("PIJ");
		subjectDetails.setDuration(38);
		subjectDetails.setSubject_Name("Programming IN Java");
		subjectDetails.setFee_Amount(8000);
		
		assertEquals(true, subjectDAO.addEntity(subjectDetails));
	}
}
