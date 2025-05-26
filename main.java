package com.main;
import com.school.School;
import com.student.Student;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School schoolobject=School.getschoolobject("UHS","PUSAPADU","Presentation Skills ");
		Student studentobject=Student.getstudentobject("suppi", "A+",schoolobject,90);
		System.out.println(schoolobject);
		System.out.println(studentobject);
	}

}
