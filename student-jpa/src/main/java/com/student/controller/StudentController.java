package com.student.controller;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class StudentController {

	StudentService service;
	
	public StudentController() {
	service=new StudentServiceImpl();
	}
	
	public Student addStudent(Student student) {
		return service.addStudent(student);
	}
	
	public void deleteTrainee(int sid) {
		service.removeStudent(sid);
	}
	
	public Student findStudent(int sid) {
		return service.getStudent(sid);
	}
	
	
}