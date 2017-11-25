package edu.neu.csye6200;

public class Teacher extends Person{
	private int credits;
	
	public Teacher(int age, String name, int Credits) {
		super(age, name);
		this.credits = Credits;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void speak() {
		System.out.println("Teacher! Age: "+ this.getAge() + ", name: " 
			    + this.getName() + ", credits: " + this.getCredits() );
	}
	
	

}
