package edu.neu.csye6200;

public class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Person! Age: "+ this.getAge() + ", name: " + this.getName() );
	}


}
