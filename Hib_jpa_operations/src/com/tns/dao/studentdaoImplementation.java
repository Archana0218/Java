package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.student;

public class studentdaoImplementation {
private EntityManager entityManager;

public studentdaoImplementation()
{
	entityManager =JpaUtil.getEntitymanager();
}
	
	public void addstudent(student student) {
	entityManager.persist(student);
	}

	public student getStudentbyStudent_ID(int student_ID) {
		return entityManager.find(student.class, student_ID);
	}

	public void updatestudent(student student) {
		entityManager.merge(student);
	}

	public void removestudent(student student) {
		entityManager.remove(student);
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	
	

}
