package edu.neu.csye6200.project_FinalExam;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
	
	public static void demo() {
		Calculator calc = new Calculator();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.sub(1, 2));
	}
}
