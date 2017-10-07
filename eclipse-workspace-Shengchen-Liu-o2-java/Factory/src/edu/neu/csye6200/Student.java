package edu.neu.csye6200;

public class Student extends PersonAPI implements Comparable<Student>{

	@Override
	public String toString() {
		return super.toString();
	}
	//toString

	@Override
	public void sort() {
		System.out.println("Sorting students...");				
	}
	
	@Override
	public int compareTo(Student student) {
		Double d = new Double (student.getGPA()*100 - this.getGPA()*100);
		return d.intValue();
	}
/**
	@Override
	public String Speak() {
		// TODO Auto-generated method stub
		return null;
	}
	
**/
	private Double GPA;
	private String parentFname;
	private String parentLname;
	
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

	public Student() {
		super();
		super.setAge(20);
		super.setFirstName("firstStudent");
		super.setLastName("lastStudent");
		GPA = 0.0;
	}
	
	public Student(String fname, String lname, int age, double gpa) {
		super();
		super.setAge(age);
		super.setFirstName(fname);
		super.setLastName(lname);
		GPA = gpa;
	}
	
	public Student(String fname, String lname, int age, double gpa, String parentFname, String parentLname) {
		super();
		super.setAge(age);
		super.setFirstName(fname);
		super.setLastName(lname);
		GPA = gpa;
		this.setParentFname(parentFname);
		this.setParentLname(parentLname);
		
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gpa) {
		GPA = gpa;
	}
	
	public int compareStudent(Student student) {
		// TODO Auto-generated method stub
		//return super.compareTo(student);
		Double d = new Double (student.getGPA()*100 - this.getGPA()*100);
		int n = d.intValue();
		return n;
	}
}
	
