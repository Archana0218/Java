package com.tns.clients;

import com.tns.entities.student;

import com.tns.service.*;

public class client {
	
	public static void main(String[] args) {

		studentservice service = new studentserviceimpl();
		student student = new student();
//create operation
		student.setStudent_ID(101);
		student.setStudent_name("ayush");
		service.addstudent(student);
		

//retrive operation
		student = service.findstudentbyStudent_ID(101);
		System.out.print("Student_Id :" + student.getStudent_ID());
		System.out.println(" Student_Name :" + student.getStudent_name());

		// update operation
		student = service.findstudentbyStudent_ID(101);
		student.setStudent_name("Ayush Ingle");
		service.updatestudent(student);

//at this breakpoint we have record added in first selction
		student = service.findstudentbyStudent_ID(101);
		System.out.print("Student_Id :" + student.getStudent_ID());
		System.out.println(" Student_Name :" + student.getStudent_name());

//delete operation
		student = service.findstudentbyStudent_ID(101);
		service.removestudent(student);
		System.out.println("End of the program Life cycle completed.....");

	}
}
