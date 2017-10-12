package edu.neu.csye6200;


public class PersonFactory {

	private PersonFactory() {
		
	}
	
	public static Person getPerson(int criteria, String fname, String lname, int age, double GPA, double wage){
		if (criteria == 0) {
			Student person = new Student(fname, lname, age, GPA);
			return person;
		}
		else {
			Employee person = new Employee(fname, lname, age, wage);
			return person;
		}
		
	}

}

	
