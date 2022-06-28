package com.tns.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int student_ID;
	private String student_name;

	public int getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	

}
