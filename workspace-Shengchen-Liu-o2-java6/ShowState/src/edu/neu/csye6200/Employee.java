package edu.neu.csye6200;

public class Employee extends Person{
	private double wages;	
	
	public Employee(int age, String name, double wages) {
		super(age, name);
		this.wages = wages;
	}

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	public void speak() {
		System.out.println("Employee! Age: "+ this.getAge() + ", name: " 
			    + this.getName() + ", wages: " + this.getWages() );
	}

	
}
