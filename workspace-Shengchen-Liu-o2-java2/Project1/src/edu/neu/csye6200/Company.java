package edu.neu.csye6200;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public void load(Employee e) {
		employees.add(e);
	}
	
	public void sort() {	
		System.out.println(employees.size() + " employees in list.");
		
		Collections.sort(employees);
		for ( Employee e: employees) {
			System.out.println("Employee: " + e.getFirstName() + " " + e.getLastName() + ". Age: " + e.getAge() 
					+ ". Hourly wage: $" + e.getWage());
		}

	}
	
	public void addEmployee(String fName, String lName, int age, double wage) {
		Employee e = (Employee) PersonFactory.getPerson("e");
		e.setFirstName(fName);
		e.setLastName(lName);
		e.setAge(age);
		e.setWage(wage);
		employees.add(e);
		
	}
	public static void demo() {
		String fileName = "employees.csv";		
		ParserReader_Employee parser = new ParserReader_Employee();
		Company obj = parser.read(fileName);
		obj.sort();
	}

}
