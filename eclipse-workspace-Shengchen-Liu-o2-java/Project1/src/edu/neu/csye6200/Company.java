package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
	private List<Employee> employees = new ArrayList<Employee>();
	public void sort() {	
		employees.add((Employee) PersonFactory.getPerson(1,"Glen", "Taylor",60, -1, 4000.00));
		employees.add((Employee) PersonFactory.getPerson(1, "Zach", "Lavine", 21, -1, 5000.00));
		employees.add((Employee) PersonFactory.getPerson(1, "Karl", "Towns", 45, -1, 4500));
		System.out.println(employees.size() + " employees in list.");
		
		Collections.sort(employees);
		for ( Employee e: employees) {
			System.out.println("Employee: " + e.getFirstName() + " " + e.getLastName() + ". Age: " + e.getAge() 
					+ ". Hourly wage: $" + e.getWage());
		}

	}
	
	public void addEmployee(String fName, String lName, int age, double gpa, double wage) {
		employees.add((Employee) PersonFactory.getPerson(1, fName, lName, age, -1, wage));
	}
	public static void demo() {
		Company obj = new Company();
		obj.addEmployee("Rick", "Adelman", 67, -1, 20000);
		obj.sort();
	}

}