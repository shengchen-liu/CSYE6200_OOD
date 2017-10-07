package edu.neu.csye6200;

public class Dog extends Animal {
	public Dog() {
		super();
		super.setName("Doggie");	// leverage super class data
	}
	
	public Dog(String name) {
		super();
		super.setName(name);	// leverage super class method
	}
	
	@Override
	public String speak() {
		return "My name is " + super.getName() + " and I am a dog.";
	}
	
	@Override
	public String toString() {
		return this.speak() + "Wuff!!";
	}
}
