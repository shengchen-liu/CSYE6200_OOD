package edu.neu.csye6200;
// automatic garbage collection
public class Animal {
	private String name;

	public Animal() { // constructor has no return type
		super();
		this.name = null;
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String speak() {
		return "My name is " + this.name + " and I am an animal";
	}

}
