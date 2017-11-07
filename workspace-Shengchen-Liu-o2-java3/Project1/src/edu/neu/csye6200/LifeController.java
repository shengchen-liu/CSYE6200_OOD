package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class LifeController extends AbstractLife{

	private List<Person> people = new ArrayList<Person>();
	private List<Student> students = new ArrayList<Student>();
	private List<Employee> employees = new ArrayList<Employee>();
	
	
	@Override
	public void loadPersons(List<String> personIDCSV) {
		
		for (String line:personIDCSV) {
			Person p = new Person();
			Person p1 = p.parsePersonIDCSV(line);
			people.add(p1);
		}				
	}

	@Override
	public void loadStudents(List<String> personIDCSV) {
		for (Person p:people) {
			Student s = new Student();
//			Student s = (Student) p;
			s.setId(p.getId());
			s.setFirstName(p.getFirstName());
			s.setLastName(p.getLastName());
			s.setAge(p.getAge());
			s.setWage(p.getWage());
			s.setGPA(p.getGPA());
			students.add(s);
		}
		
	}

	@Override
	public void loadEmployees(List<String> personIDCSV) {
		for (Student s:students) {
			Employee e = new Employee();
			e.setId(s.getId());
			e.setFirstName(s.getFirstName());
			e.setLastName(s.getLastName());
			e.setAge(s.getAge());
			e.setWage(s.getWage());
			employees.add(e);
		}
		
	}

	@Override
	public void agePersons(int offset, int scale) {
		for (Person p: people) {
			p.setAge(p.getAge() + offset);
		}
		
	}
	
	public void ageStudents(int offset, int scale) {
		for (Student s: students) {
			s.setAge(s.getAge() + offset);
		}
		
	}

	@Override
	public void scaleStudentsGPA(double offset, double scale) {
		for (Student s: students) {
			s.setGPA(s.getGPA() + offset);
		}
		
	}

	@Override
	public void scaleEmployeeWages(double offset, double scale) {
		for (Employee e: employees) {
			e.setWage(e.getWage() + offset);
		}
		
	}

	@Override
	public void showPersons() {
		System.out.println("Show all persons...");
		for( Person p: people) {
			System.out.println("id: "+ p.getId() + " FirstName: "+ p.getFirstName() + 
					" LastName: " + p.getLastName() + " age: " + p.getAge());
		}
		
	}

	@Override
	public void showStudents() {
		System.out.println("Show all students...");
		for( Person s: students) {
			System.out.println("id: "+ s.getId() + " FirstName: "+ s.getFirstName() + 
					" LastName: " + s.getLastName() + " age: " + s.getAge() + " GPA: " + s.getGPA());
		}
		
		
	}

	@Override
	public void showEmployees() {
		System.out.println("Show all employees...");
		for( Person e: employees) {
			System.out.println("id: "+ e.getId() + " FirstName: "+ e.getFirstName() + 
					" LastName: " + e.getLastName() + " age: " + e.getAge() + " Wage: $" + e.getWage());
		}
		
	}

	@Override
	public void sortPersonsByLastName() {
		System.out.println("Sort all persons by last name...");
		people.sort((p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));		
		
	}

	@Override
	public void sortStudentsByGPA() {
		System.out.println("Sort all students by GPA...");
		students.sort((s1,s2) -> s2.getGPA().compareTo(s1.getGPA()));	
	}

	@Override
	public void sortEmployeesByWage() {
		System.out.println("Sort all employees by wages...");
		employees.sort((e1,e2) -> e2.getWage().compareTo(e1.getWage()));	
		
	}

}
