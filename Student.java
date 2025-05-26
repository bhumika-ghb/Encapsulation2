package com.student;
import com.school.School;

public class Student {
	private String studentName;
	private String grade;
	private School school;
	private double averagemarks;
	private Student(String studentName,String grade,School school,double averagemarks) {
		this.studentName=studentName;
		this.grade=grade;
		this.school=school;
		this.averagemarks=averagemarks;
		
	}
	public String getstudentName() {
		return studentName;
	}
	public String getgrade() {
		return grade;
	}
	public School school() {
		return school;
	}
	public double averagemarks() {
		return averagemarks;
	}
	public void setstudentName(String studentName) {
		this.studentName=studentName;
	}
	public void setgrade(String grade) {
		this.grade=grade;
	}
	public void setschool(School school) {
		this.school=school;
	}
	public void averagemarks(double averagemarks) {
		if(averagemarks<0 && averagemarks>100) {
			this.averagemarks=averagemarks;
		}
	}
	public String toString() {
		return "Student[student Name:"+studentName+",Student Grade:"+grade+",Student School:"+school+",Student averageMarks:"+averagemarks+"]";
	}
	public static Student getstudentobject(String studentName,String grade,School school,double averagemarks) {
		if(school==null) {
			return null;
		}else {
			return new Student(studentName,grade,school,averagemarks);
		}
		
	}
}
