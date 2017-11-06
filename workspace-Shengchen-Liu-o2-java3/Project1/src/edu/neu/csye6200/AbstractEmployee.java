package edu.neu.csye6200;

import edu.neu.csye6200.Person;

public abstract class AbstractEmployee extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract double getWage();
	public abstract void setWage(double age);
}
