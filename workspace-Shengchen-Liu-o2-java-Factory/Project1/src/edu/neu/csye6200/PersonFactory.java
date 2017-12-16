package edu.neu.csye6200;


public class PersonFactory {

	private PersonFactory() {
		
	}
	
	public static Person getPerson(String criteria){
		if (criteria == "s") {
			Student person = new Student();
			return person;
		}
		else if (criteria == "e" ){
			Employee person = new Employee();
			return person;
		}
		else throw new ArithmeticException("Criteria is not valid!");
	}

}

	
