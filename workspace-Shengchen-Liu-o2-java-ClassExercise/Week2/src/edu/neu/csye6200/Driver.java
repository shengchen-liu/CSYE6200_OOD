package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String [] args) {
		System.out.println("Project executing...");
		Calc obj;  //variable of object, named obj. Reference type
		obj = new Calc(); // instantiate a Calc object. Memory used
		obj.setA(3);
		obj.setB(4);
		obj.add();
		obj.show();
		
		Animal animal = new Animal();
		animal.setName("Java");
		
		System.out.println(animal.speak());
		
		
		Person p1 = new Person(50);
		System.out.println(p1.speak());
		
		Person p2 = new Student();
		System.out.println(p2.speak());
		
		Person p3 = new Student(4.0);
		System.out.println(p3.speak());
		
		System.out.println("Display all the persons...");
		List<Person> l = new ArrayList<Person>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		System.out.println(l.size() + " persons in list, namely: ");
		for (Person p : l) {
			System.out.println(p.speak());
		}
	} // end main method

}
