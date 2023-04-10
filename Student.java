package org.Student;

import org.Department.Department;

//import org.College.College;

public class Student extends Department{

	protected void studentName()
	{
		System.out.println("Student Name : Venkatesh S");
	}
	
	protected void studentDept()
	{
		System.out.println("Student Dept : CSE");
	}
	
	protected void studentId()
	{
		System.out.println("Student ID : 51");
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.departmentName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}
}
