package com.pack;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class MyInter extends EmptyInterceptor {

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) 
	{
		if(entity instanceof Student)
		{
			System.out.println("Student object is going to BE saveD");
		}
		return true;
	}
	@Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types)
	{
		if(entity instanceof Student)
		{
			System.out.println("Student object is going to BE  updateD");
		}
		return true;
	}
	@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) 
	{
		if(entity instanceof Student)
		{
			System.out.println("Student object is loaded");
		}
		return  true;
	}
}
