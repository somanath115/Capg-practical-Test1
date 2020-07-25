package com.student.service;

import com.student.dao.StudentDao;
import com.student.model.Student;

public class StudentServiceImpl implements StudentService {
	
	StudentDao dao;
	public StudentServiceImpl(){
		dao=new StudentDao();
	}

	@Override
	public Student addStudent(Student student){
		return dao.addStudent(student);
		
	}

	@Override
	public void removeStudent(int sid) {
		// TODO Auto-generated method stub
		dao.removeStudent(sid);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return dao.findStudent(id);
	}

}