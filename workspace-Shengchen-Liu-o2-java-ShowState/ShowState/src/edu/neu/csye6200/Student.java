package edu.neu.csye6200;

public class Student extends Person{
	private double grade;

	
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Student(int age, String name, double Grade) {
		super(age, name);
		this.grade = Grade;
	}

	public void speak() {
		System.out.println("Student! Age: "+ this.getAge() + ", name: " 
	    + this.getName() + ", grade: " + this.getGrade() );
	}
	
	

}
