package edu.neu.csye6200.project_FinalExam;

public class StudentFactory {
	private StudentFactory() {
		
	}
	
	public static Student getStudent(String criteria) {
		if (criteria == "s") {
			Student student = new Student();
			return student;
		}
		else throw new ArithmeticException("Criteria is not valid!");
		
	}
}
