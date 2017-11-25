package edu.neu.csye6200;

import java.time.LocalDate;

public class Person extends AbstractPerson {
	private String firstName;
	private String lastName;
	private int Age;
	private int ID;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	@Override
	public LocalDate getDob() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDob(LocalDate dob) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Gender getGender() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setGender(Gender gender) {
		// TODO Auto-generated method stub
		
	}
	public Person(int ID,String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Age = age;
	}
	
	
	
	
	

}
