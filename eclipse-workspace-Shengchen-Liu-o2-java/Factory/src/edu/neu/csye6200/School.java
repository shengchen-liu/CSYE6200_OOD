package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
	private List<Student> students = new ArrayList<Student>();
	public void sort() {

		students.add((Student) PersonFactory.getPerson(0, "Tyrus", "Jones", 26, 3.7, 0));
		students.add((Student) PersonFactory.getPerson(0, "Jimmy", "Butler", 29, 3.5, 0));
		students.add((Student) PersonFactory.getPerson(0, "Jeremy", "Lin", 28, 3.9, 0 ));
		students.add((Student) PersonFactory.getPerson(0, "Andrew", "Wiggins", 22, 4.0, 0));
		System.out.println(students.size() + " students in list.");
		
		Collections.sort(students);
		for ( Student s: students) {
			System.out.println("Student: " + s.getFirstName() + " " + s.getLastName() + ". Age: " + s.getAge() 
					+ ". GPA: " + s.getGPA());
		}
	}
	
	public void addStudent(String fName, String lName, int age, double gpa, double wage) {
		students.add((Student) PersonFactory.getPerson(0, fName, lName, age, gpa, wage));
	}
	
	public static void demo() {
		School obj = new School();
		obj.addStudent("Stephen", "Curry", 28, 3.7, 0);
		obj.sort();
	}
}