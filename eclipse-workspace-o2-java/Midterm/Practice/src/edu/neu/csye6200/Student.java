package edu.neu.csye6200;

public class Student extends Person{
	private double gpa = 0.0;
	private String parentFname;
	private String parentLname;

	public Student() {
		// TODO Auto-generated constructor stub
		this.setfName("Sheng");
		this.setlName("Liu");
		this.setAge(27);
		gpa = 0.0;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(String lName, String fName, int age) {
		super(lName, fName, age);
		// TODO Auto-generated constructor stub
		this.setlName(lName);
		this.setfName(fName);
		this.setAge(age);
	}

	public Student(String lName, String fName, int age, double gpa) {
		super();
		this.setlName(lName);
		this.setfName(fName);
		this.setAge(age);
		this.gpa = gpa;
	}
	
	@Override
	public String speak() {
		return "My name is " + this.getfName() + " " + this.getlName() + ". And I am " + this.getAge() + ". My GPA is "+ this.getGpa();  
	}

	public Student(String fname, String lname,int age, double gpa, String parentFname, String parentLname) {
		super();
		this.gpa = gpa;
		this.parentFname = parentFname;
		this.parentLname = parentLname;
	}
	

}
