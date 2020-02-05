package com.niit.dao;

import java.util.List;

import com.niit.model.FacultyDetails;

public interface GenericCrud 
{
	public <T> boolean addEntity(T t);
	public <T> boolean deleteEntity(T t);
	public <T> boolean updateEntity(T t);
	public <T> List<T> displayEntity();
	public <T> T displayEntity(T t);
}
