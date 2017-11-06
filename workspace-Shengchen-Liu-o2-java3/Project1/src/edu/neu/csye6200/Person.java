package edu.neu.csye6200;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person extends AbstractPerson{

	private int ID;
	private String firstName;
	private String lastName;
	private int age;

	private double wage;
	
//	public double getGPA() {
//		return gpa;
//	}
//
//	public void setGPA(double GPA) {
//		this.gpa = GPA;
//	}

	public double getWage() {
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
	public AbstractPerson parsePersonIDCSV(String personCSVLine) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person() {
		super();
		ID = -1;
		firstName = null;
		lastName = null;
		age = 0;
		//gpa = 0;
		wage = 0;
	}

	public Person(int iD, String firstName, String lastName, int age, double gpa, double wage) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		//this.gpa = gpa;
		this.wage = wage;
	}
	

	
	public void demo() {
		List<String> csvData = new ArrayList<String>();
		csvData.add("1,sam,jones,7,2.65,6.75,end");
		csvData.add("2,dan,smith,6,2.75,4.80,end");
		csvData.add("3,jim,adams,8,2.35,3.25,end");
		csvData.add("4,jan,lake,9,2.95,5.85,end");
		csvData.add("5,sam,jones,7,2.65,2.75,end");
		
		List<Person> people = new ArrayList<Person>();
		for (String line:csvData) {
			Scanner in = new Scanner(line);
			in.useDelimiter(",");
			Person p = new Person();
			p.setId(in.nextInt());
			p.setFirstName(in.next());
			p.setLastName(in.next());
			p.setAge(in.nextInt());
			//p.setGPA(in.nextDouble());
			//p.setWage(in.nextDouble());
			people.add(p);
			in.close();
		}
		
		people.sort((p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("Sort all persons by last name...");
		for( Person p: people) {
			System.out.println("id: "+ p.getId() + " FirstName: "+ p.getFirstName() + 
					" LastName: " + p.getLastName() + " age: " + p.getAge());
		}
	}
	
	
}
