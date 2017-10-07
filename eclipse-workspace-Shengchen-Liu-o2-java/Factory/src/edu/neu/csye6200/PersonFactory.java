package edu.neu.csye6200;


public class PersonFactory {

	private PersonFactory() {
		
	}
	
	public static PersonAPI getPerson(int criteria){
		PersonAPI person = null; // new PersonAPI();
		if (criteria == 0) {
			person = new Student();
		}
		else {
			person = new Employee();
		}
		return person;
		
	}

}

	