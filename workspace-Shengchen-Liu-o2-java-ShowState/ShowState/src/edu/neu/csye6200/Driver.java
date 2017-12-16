package edu.neu.csye6200;


public class Driver {

	public static void main(String[] args) {
		
		ShowState<String> showString = new ShowState<String>("This is a String");
		System.out.println("String!" + showString.getObject());

		ShowState<Person> showPerson = new ShowState<Person>(new Person(12,"Andrew Wiggins"));		
		showPerson.display();
		
		ShowState<Student> showStudent = new ShowState<Student>(new Student(22, "Zach Lavine", 4.0));
		showStudent.display();
		
		ShowState<Teacher> showTeacher = new ShowState<Teacher>(new Teacher(50, "Tom Thibs", 8));
		showTeacher.display();
		
		ShowState<Employee> showEmployee = new ShowState<Employee>(new Employee(70, "Gleen Taylor", 2134.90));
		showEmployee.display();
	}

}

//Results:
//String!This is a String
//Person! Age: 12, name: Andrew Wiggins
//Student! Age: 22, name: Zach Lavine, grade: 4.0
//Teacher! Age: 50, name: Tom Thibs, credits: 8
//Employee! Age: 70, name: Gleen Taylor, wages: 2134.9