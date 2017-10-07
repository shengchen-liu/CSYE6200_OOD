package edu.neu.csye6200;

public class Student extends Person{
	private double GPA;

	public Student() {
		super();
		super.setAge(20);
		super.setFirstName("firstStudent");
		super.setLastName("lastStudent");
		GPA = 0.0;
	}
	public Student(double gpa) {
		super();
		super.setAge(20);
		super.setFirstName("firstStudent");
		super.setLastName("lastStudent");
		GPA = gpa;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	@Override
	public String speak() {
		return "My name is " + super.getFirstName() + " " + super.getLastName()+ " and I am a student." + " My GPA is: " + this.getGPA();
	}
	
	
	

}
