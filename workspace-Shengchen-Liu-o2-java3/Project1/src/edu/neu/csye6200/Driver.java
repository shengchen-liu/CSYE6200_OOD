package edu.neu.csye6200;

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
		System.out.println("Running Person...");
		Person p = new Person();
		p.demo();

		Student s = new Student();
		
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
