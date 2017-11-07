package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// Part1
		System.out.println("Running Midterm...");
		Midterm mt1 = new Midterm();
		mt1.showIntData();
		
		Midterm mt2 = new Midterm();
		mt2.transformIntData();
		
		Midterm mt3 = new Midterm();
		mt3.TransformIntData1();
		
		Midterm mt4 = new Midterm(1.1, 2.1, 3.1);
		mt4.TransformIntData2();
		
		// Part2
		System.out.println("Running LifeController...");
		List<String> csvData = new ArrayList<String>();
		// Read data from .csv file?
		csvData.add("1,sam,jones,7,2.65,6.75,end");
		csvData.add("2,dan,smith,6,2.75,4.80,end");
		csvData.add("3,jim,adams,8,2.35,3.25,end");
		csvData.add("4,jan,lake,9,2.95,5.85,end");
		csvData.add("5,sam,jones,7,2.65,2.75,end");
		
		LifeController life = new LifeController();
		life.loadPersons(csvData);
		life.sortPersonsByLastName();
		life.showPersons();

		// double or Double?  Can I change return type in Abstract class?
		// loadStudents ?
		
		life.agePersons(10, 1);
		life.loadStudents(csvData);
		life.scaleStudentsGPA(1, 1);
		life.sortStudentsByGPA();
		life.showStudents();
		
		// ageStudents ?
//		life.agePersons(10, 1);
		life.ageStudents(10, 1);
		life.loadEmployees(csvData);
		life.scaleEmployeeWages(10, 1);
		life.sortEmployeesByWage();
		life.showEmployees();

		
	}

}

//Running Midterm...
//Running method 'showIntData': 1, 2, 3
//Running method 'transformIntData': 2, 3, 4, sum =18
//Running method 'TransformIntData1':...
//2
//3
//4
//sum: 18
//Running method 'TransformIntData2':...
//2.1
//3.1
//4.1
//sum: 18.6

//Running LifeController...
//Sort all persons by last name...
//Show all persons...
//id: 3 FirstName: jim LastName: adams age: 8
//id: 1 FirstName: sam LastName: jones age: 7
//id: 5 FirstName: sam LastName: jones age: 7
//id: 4 FirstName: jan LastName: lake age: 9
//id: 2 FirstName: dan LastName: smith age: 6
//Sort all students by GPA...
//Show all students...
//id: 4 FirstName: jan LastName: lake age: 19 GPA: 3.95
//id: 2 FirstName: dan LastName: smith age: 16 GPA: 3.75
//id: 1 FirstName: sam LastName: jones age: 17 GPA: 3.65
//id: 5 FirstName: sam LastName: jones age: 17 GPA: 3.65
//id: 3 FirstName: jim LastName: adams age: 18 GPA: 3.35
//Sort all employees by wages...
//Show all employees...
//id: 1 FirstName: sam LastName: jones age: 27 Wage: $16.75
//id: 4 FirstName: jan LastName: lake age: 29 Wage: $15.85
//id: 2 FirstName: dan LastName: smith age: 26 Wage: $14.8
//id: 3 FirstName: jim LastName: adams age: 28 Wage: $13.25
//id: 5 FirstName: sam LastName: jones age: 27 Wage: $12.75