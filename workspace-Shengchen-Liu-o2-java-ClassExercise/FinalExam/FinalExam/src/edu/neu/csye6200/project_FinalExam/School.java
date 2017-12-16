package edu.neu.csye6200.project_FinalExam;

import java.util.Collections;
import java.util.List;

public class School {
	private List<Student> students;
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
		Student s = StudentFactory.getStudent("s");
		s.setFirstName(fName);
		s.setLastName(lName);
		s.setAge(age);
		s.setGPA(gpa);
		this.load(s);
	}
	static void demo() {
		String fileName = "students2.csv";	
		ParserReader_Student parser = new ParserReader_Student();
		School school = parser.read(fileName);
		school.sort();
	}
}
