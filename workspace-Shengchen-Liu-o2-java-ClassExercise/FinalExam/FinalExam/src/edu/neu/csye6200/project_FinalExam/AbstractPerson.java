package edu.neu.csye6200.project_FinalExam;

import java.time.LocalDate;


public abstract class AbstractPerson {
	public enum Gender {
		UNKNOWN, MALE, FEMALE
	}

	public abstract int getAge();
	public abstract void setAge(int age);
	public abstract AbstractPerson agePerson(int offset, int scale);
	public abstract String getFirstName();
	public abstract void setFirstName(String firstName);
	public abstract String getLastName();
	public abstract void setLastName(String lastName);
	public abstract LocalDate getDob();
	public abstract void setDob(LocalDate dob);
	public abstract Gender getGender();
	public abstract void setGender(Gender gender);
	public abstract int getId();
	public abstract void setId(int id);

	public abstract AbstractPerson parsePersonIDCSV(String personCSVLine);

}
