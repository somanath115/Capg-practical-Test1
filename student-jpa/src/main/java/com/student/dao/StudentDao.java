package com.student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.student.model.Student;

public class StudentDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("trainee-unit");
	EntityManager em=emf.createEntityManager();
	EntityTransaction tx=em.getTransaction();
	
	public Student addStudent(Student s) {
		tx.begin();
		em.persist(s);
		tx.commit();
		System.out.println("Added a new Student");
		return s;
	}
	
	public Student findStudent(int sid) {
		tx.begin();
		Student s = em.find(Student.class, sid);
		tx.commit();
		return s;
	}
	
	public void removeStudent(int sid) {
		tx.begin();
		Student s = em.find(Student.class, sid);
		em.persist(s);
		em.remove(s);
		em.detach(s);
		tx.commit();
	}
}
