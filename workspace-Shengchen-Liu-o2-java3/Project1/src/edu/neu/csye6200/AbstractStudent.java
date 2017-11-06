package edu.neu.csye6200;

import edu.neu.csye6200.Person;

public abstract class AbstractStudent extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public abstract double getGPA();
	public abstract void setGPA(double gpa);
}
