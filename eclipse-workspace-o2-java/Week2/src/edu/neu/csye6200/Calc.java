package edu.neu.csye6200;

public class Calc {
	// class member data
    private int a;  // encapsulation
    private int b;
    private int result;
    
    // member methods : API or interface
	public Calc() { // default constructor, no args
		super();
		this.a = 0; // primitive type
		this.b = 0;
		this.result = 0;
	}

	// source -> getters and setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public int add() {
		this.result = this.a + this.b;
		return result;
	}
	
	public int sub() {
		this.result = this.a - this.b;
		return result;
	}
	public int mult() {
		this.result = this.a * this.b;
		return result;
	}
	public int div() {
		this.result = this.a / this.b;
		return result;
	}
	
	public void show() {
		System.out.println("Calc result is: " + this.result);
	}
}
