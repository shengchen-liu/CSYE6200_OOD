package edu.neu.csye6200;

public class Student extends AbstractStudent{

	private double GPA;
	
	@Override
	public double getGPA() {
		return this.GPA;
	}

	@Override
	public void setGPA(double gpa) {
		this.GPA = gpa;
	}

	public Student() {
		super();
		GPA = 0;
	}
	


}
