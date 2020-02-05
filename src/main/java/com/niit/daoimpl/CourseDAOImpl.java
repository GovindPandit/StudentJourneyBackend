package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.niit.backend.HibernateUtil;
import com.niit.dao.CourseDAO;
import com.niit.dao.GenericCrud;
import com.niit.model.CourseDetails;
import com.niit.model.FacultyDetails;

public class CourseDAOImpl implements CourseDAO
{
	public <T> boolean addEntity(T t) 
	{
		Transaction tx=null;
		try
		{
			Session session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			session.save(t);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			tx.rollback();
			System.out.println(e);
			return false;
		}
	}

	public <T> boolean deleteEntity(T t) 
	{
		Transaction tx=null;
		try
		{
			Session session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			session.delete(t);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			tx.rollback();
			System.out.println(e);
			return false;
		}
	}

	public <T> boolean updateEntity(T t) 
	{
		Transaction tx=null;
		try
		{
			Session session=HibernateUtil.getSession();
			tx=session.beginTransaction();
			session.update(t);
			tx.commit();
			return true;
		}
		catch (Exception e) 
		{
			tx.rollback();
			System.out.println(e);
			return false;
		}
	}

	public <T> List<T> displayEntity() 
	{
		try
		{
			Session session=HibernateUtil.getSession();
			return session.createQuery("from com.niit.model.CourseDetails").getResultList();
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return null;
		}
	}

	public <T> T displayEntity(T t) 
	{
		try
		{
			Session session=HibernateUtil.getSession();
			Query query=session.createQuery("from com.niit.model.CourseDetails where course_Code= :course_Code");
			return (T)query.setParameter("course_Code", t).getResultList().get(0);
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return null;
		}
	}
	
}
