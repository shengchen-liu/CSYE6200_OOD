package edu.neu.csye6200;

public class Student extends AbstractStudent{

	private Double GPA;
	
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
	
}
