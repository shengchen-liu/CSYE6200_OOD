package edu.neu.csye6200;

public class Animal {
	public class Dog {

	}
	String name;

	public Animal() {
		super();
		this.name = "Animal";
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
		return "My name is '" + this.name + "'˜ and I'm an animal.";
	}
	@Override
	public String toString() {
		return this.speak();
	}
}
