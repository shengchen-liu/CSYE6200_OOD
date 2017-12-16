package edu.neu.csye6200;

import java.util.Comparator;

// this is a concrete superclass
public class Person implements Life, Comparable<Person>{
	private String lastName;
	private String firstName;
	private int Age;
	
	@Override
	public String speak() {
		return "My name is " + this.getfName() + " " + this.getlName() + ". And I am " + this.getAge();  
		}

	
	public String getlName() {
		return lastName;
	}
	public void setlName(String lName) {
		this.lastName = lName;
	}
	public String getfName() {
		return firstName;
	}
	public void setfName(String fName) {
		this.firstName = fName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

	// Constructor
	public Person() {
		super();
		this.lastName = "Liu";
		this.firstName = "Sheng";
		this.Age = 27;
	}
	
	public Person(String lName, String fName, int age) {
		super();
		this.lastName = lName;
		this.firstName = fName;
		Age = age;
	}




	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.getfName().compareTo(o.getfName());
	}
		
	

}
