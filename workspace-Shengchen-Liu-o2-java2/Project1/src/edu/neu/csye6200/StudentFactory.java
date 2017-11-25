package edu.neu.csye6200;

public class StudentFactory {
	// abstract constructor
	private StudentFactory(){
		
	}
	public static Student getStudent(String criteria) {
		if (criteria == "s") {
			Student student = new Student();
			student.setAge(1);
			return student;
		}
		else throw new ArithmeticException("Criteria is not valid!");
	}

}
