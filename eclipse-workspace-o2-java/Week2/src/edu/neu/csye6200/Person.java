package edu.neu.csye6200;

public class Person {

	private String lastName;
	private String firstName;
	private int age = 0;
	
	public Person() {

		this.lastName = "Last";
		this.firstName = "first";
		this.age = 3;
		
	}
	public Person(int age) {

		this.lastName = "Last";
		this.firstName = "first";
		this.age = age;
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "My name is " + this.getFirstName() + " " + this.getLastName();
	}
	
}
