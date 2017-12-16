package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver executing main...");
//
////		Shout s = new Shout();  // instantiate obj from Shout class using default parameters in class
//		Shout s = new Shout(33, "Dan", 'F', "Pet");  // instantiate obj from Shout class using supplied parameters
////		s.age = 8; // this is bad! public data is NOT encapsulation, not data hiding
//		System.out.println( "Are you: "
//				+ s.getFname() + " "
//				+ s.getMi() + ". "
//				+ s.getLname() + ", "
//				+ "Age: " + s.getAge());

		Animal a1 = new Animal("Oxxie");
		System.out.println(a1);

		Dog a2 = new Dog();
		System.out.println(a2);

		Dog a3 = new Dog("Lassie");
		System.out.println(a3);
		
		System.out.println("Display all the animals...");
		List<Animal> l = new ArrayList<Animal>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		System.out.println(l.size() + " animals in list, namely: ");
		for (Animal a : l) {
			System.out.println(a);
		}
	}

}
