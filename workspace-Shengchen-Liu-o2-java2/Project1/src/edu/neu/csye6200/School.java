package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
	private List<Student> students = new ArrayList<Student>();

	public void load(Student s) {
		students.add(s);
	}

	public void sort() {

		System.out.println(students.size() + " students in list.");

		Collections.sort(students);
		for (Student s : students) {
			System.out.println("Student: " + s.getFirstName() + " " + s.getLastName() + ". Age: " + s.getAge()
					+ ". GPA: " + s.getGPA());
		}
	}

	public void addStudent(String fName, String lName, int age, double gpa) {
		Student s = (Student) PersonFactory.getPerson("s");
		s.setFirstName(fName);
		s.setLastName(lName);
		s.setAge(age);
		s.setGPA(gpa);
		students.add(s);
	}

	public static void demo() {
		String fileName = "students2.csv";		
		ParserReader_Student parser = new ParserReader_Student();
		School obj = parser.read(fileName);
		obj.sort();
	}
}
