package com.student.service;

import com.student.model.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public void removeStudent(int sid);
	public Student getStudent(int sid);

}
