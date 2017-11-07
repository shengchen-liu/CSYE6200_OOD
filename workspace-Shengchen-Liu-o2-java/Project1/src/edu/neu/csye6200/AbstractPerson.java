package edu.neu.csye6200;

import java.time.LocalDate;

public abstract class AbstractPerson {
	

	public enum Gender {
		UNKNOWN, MALE, FEMALE
	}

	public abstract int getAge();
	public abstract void setAge(int age);
	public abstract String getFirstName();
	public abstract void setFirstName(String firstName);
	public abstract String getLastName();
	public abstract void setLastName(String lastName);
	public abstract LocalDate getDob();
	public abstract void setDob(LocalDate dob);
	public abstract Gender getGender();
	public abstract void setGender(Gender gender);
//	public abstract int getId();
//	public abstract void setId(int id);
	

//	public enum Gender {
//		MALE, FEMALE
//	}
//
//	private int age = 0;
//	private String fname = null;
//	private String lname = null;
//	LocalDate	dob = null;
//	Gender gender = null;
//	
//	public AbstractPerson() {
//		super();
//		this.initPerson("first_name", "last_name", IsoChronology.INSTANCE.date(2016, 6, 20));
//	}
//
//	public AbstractPerson(String fname, String lname, LocalDate dob) {
//		super();
//		this.initPerson(fname, lname, dob);
//	}
//
//	public AbstractPerson(int age, String fname, String lname) {
//		super();
//		this.initPerson(age, fname, lname);
//	}
//
//	private void initPerson(String fname, String lname, LocalDate dob) {
//		this.fname = fname;
//		this.lname = lname;
//		this.dob = dob;
//	}
//
//	private void initPerson(int age, String fname, String lname) {
//		this.setAge(age);
//		this.fname = fname;
//		this.lname = lname;
//	}
//
//	public int getAge() {
//		// interval between date of birth and today's date, in years
//		this.age = dob.until(IsoChronology.INSTANCE.dateNow()).getYears();
//		return this.age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//		this.dob = LocalDate.now().minusYears(age);
//	}
//
//	public String getFname() {
//		return fname;
//	}
//
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//
//	public String getLname() {
//		return lname;
//	}
//
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	
//	public LocalDate getBirthday() {
//		return dob;
//	}
//
//	public void setBirthday(LocalDate birthday) {
//		this.dob = birthday;
//	}
//	
//	public static int compareByAge(AbstractPerson p1, AbstractPerson p2) {
//		return p1.dob.compareTo(p2.dob);
//	}
//	
//	public static int compareByFirstName(AbstractPerson p1, AbstractPerson p2) {
//		return p1.getFname().compareTo(p2.getFname());
//	}
//	
//	public static int compareByLastName(AbstractPerson p1, AbstractPerson p2) {
//		return p1.getLname().compareTo(p2.getLname());
//	}
//
//	public Gender getGender() {
//		return gender;
//	}
//
//	public void setGender(Gender gender) {
//		this.gender = gender;
//	}
//
//	abstract public void show();	// abstract method: derived class MUST implement
}