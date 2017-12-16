package edu.neu.csye6200;

import java.time.LocalDate;
import java.util.Scanner;

public class Person extends AbstractPerson{

	private int ID;
	private String firstName;
	private String lastName;
	private int age;
	private Double gpa;
	private double wage;
	
	public Double getGPA() {
		return gpa;
	}

	public void setGPA(double GPA) {
		this.gpa = GPA;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(double Wage) {
		this.wage = Wage;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int Age) {
		this.age = Age;		
	}

	@Override
	public AbstractPerson agePerson(int offset, int scale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
		
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

	@Override
	public int getId() {
		return this.ID;
	}

	@Override
	public void setId(int id) {
		this.ID = id;
		
	}

	@Override
	public Person parsePersonIDCSV(String personCSVLine) {
		
		Scanner in = new Scanner(personCSVLine);
		in.useDelimiter(",");
		this.setId(in.nextInt());
		this.setFirstName(in.next());
		this.setLastName(in.next());
		this.setAge(in.nextInt());
		this.setGPA(in.nextDouble());
		this.setWage(in.nextDouble());
		in.close();
		return this;

	}

	public Person() {
		super();
		ID = -1;
		firstName = null;
		lastName = null;
		age = 0;
	}

	public Person(int iD, String firstName, String lastName, int age, double gpa, double wage) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
		
}
