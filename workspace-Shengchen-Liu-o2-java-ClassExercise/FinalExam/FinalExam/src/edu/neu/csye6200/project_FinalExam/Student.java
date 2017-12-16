package edu.neu.csye6200.project_FinalExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends AbstractStudent implements Comparable<Student>{
	private Double GPA;
	private String parentFname;
	private String parentLname;

	@Override
	public Double getGPA() {
		return this.GPA;
	}

	@Override
	public void setGPA(double gpa) {
		this.GPA = gpa;
	}

	public Student() {
		super();
		GPA = 0.0;
	}
	

	public String getParentFname() {
		return parentFname;
	}

	public void setParentFname(String parentFname) {
		this.parentFname = parentFname;
	}

	public String getParentLname() {
		return parentLname;
	}

	public void setParentLname(String parentLname) {
		this.parentLname = parentLname;
	}

	public Student(String firstName, String lastName, int age, Double gPA, String parentFname, String parentLname) {
		super();
		this.GPA = gPA;
		this.parentFname = parentFname;
		this.parentLname = parentLname;
	}

	@Override
	public int compareTo(Student o) {
		return this.getGPA().compareTo(o.getGPA());
	}
	
	
	
	
	
	
	

}
