package com.neu.csye.part1;

public class Student extends Person{
	private Double gpa;

	public Student(String fname, String lname, int age, Double gpa) {
		super(fname, lname, age);
		this.gpa = gpa;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return getFname() + " " + getLname() + "->" + "Age :" + getAge() + " GPA : " + this.gpa;
	}
}
