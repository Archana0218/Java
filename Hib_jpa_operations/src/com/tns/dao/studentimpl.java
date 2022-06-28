package com.tns.dao;

import com.tns.entities.*;

public interface studentimpl {
	public abstract void addstudent(student student);
	public abstract student getstudentbystudent_ID(int Student_ID);
	public abstract void updatestudent(student student);
	public abstract void removestudent(student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
	
}
