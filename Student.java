package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("This is a studentName");
	}
	public void studentDept() {
		System.out.println("This is a studentDept");
	}
	public void studentId() {
		System.out.println("This is a studentId");
	}

	public static void main(String[] args)
	{
		Student student = new Student();
		student.collegeName();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
}
