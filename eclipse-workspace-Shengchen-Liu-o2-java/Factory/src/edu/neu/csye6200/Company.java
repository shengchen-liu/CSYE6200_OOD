package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Company {
	public void sort() {
		List<PersonAPI> employees = new ArrayList<PersonAPI>();
		employees.add(PersonFactory.getObject(1));
		employees.add(PersonFactory.getObject(0));
		employees.add(PersonFactory.getObject(1));
		employees.add(PersonFactory.getObject(1));
		System.out.println(employees.size() + "employees in list.");
		
		for (PersonAPI p:employees) {
			p.sort();
		}
	}
	
	public static void demo() {
		Company obj = new Company();
		obj.sort();
	}

}