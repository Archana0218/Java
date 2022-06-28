package com.tns.service;

import com.tns.dao.studentdaoImplementation;
import com.tns.entities.student;

public class studentserviceimpl implements studentservice {
	private studentdaoImplementation dao;

	public void addstudent(student student) {
		dao = new studentdaoImplementation();
		dao.addstudent(student);
		dao.beginTransaction();
		dao.commitTransaction();

	}

	public student findstudentbyStudent_ID(int Student_ID) {
		student student = dao.getStudentbyStudent_ID(Student_ID);
		return student;
	}

	public void updatestudent(student student) {
		dao.beginTransaction();
		dao.updatestudent(student);
		dao.commitTransaction();

	}

	public void removestudent(student student) {
		dao.beginTransaction();
		dao.removestudent(student);
		dao.commitTransaction();

	}

}
