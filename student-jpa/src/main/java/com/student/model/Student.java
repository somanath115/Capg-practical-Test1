package com.student.model;

import java.util.Date;

public class Student {
	private int studentId;
	private String name;
	private Date DOB;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Student(int studentId, String name, Date dOB) {
		super();
		this.studentId = studentId;
		this.name = name;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", DOB=" + DOB + "]";
	}
}
