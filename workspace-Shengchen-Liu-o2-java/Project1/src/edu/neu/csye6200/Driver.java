package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		MidTerm mid = new MidTerm();
		mid.showIntData();
		mid.transformIntData();
		mid.listIteratorTransformIntData1();
		mid.listIteratorTransformIntData2();
		
		//Part 2		
		List<String> people = new ArrayList<String>();
		people.add("1,sam,jones,7,2.65,6.75,end");
		people.add("2,dan,smith,6,2.75,4.80,end");
		people.add("3,jim,adams,8,2.35,3.25,end");
		people.add("4,jan,lake,9,2.95,5.85,end");
		people.add("5,sam,jones,7,2.65,2.75,end");

		List<Person> allPersons = new ArrayList<Person>();
		
		String inputLine = null;
		for (String inLine: people) {
			String[] fields = inputLine.split(",");
			String lname = fields[2];
			String fname = fields[1];
			int ID = new Integer(fields[0]);
			int age = new Integer(fields[3]);
			double gpa = new Double(fields[4]);
			int wage = new Integer(fields[5]);
			Person person = new Person(ID, fname, lname,age);
			allPersons.add(person);
		}
		
		Collections.sort(allPersons,comparator);
//  Sorry I do not have enough time
	}

}

// public class Parser {
// School read(String fileName) {
// School obj = new School();
// try (BufferedReader inLine = new BufferedReader(new FileReader(fileName))) {
// String inputLine = null; // read one line from file at a time
// while ((inputLine = inLine.readLine()) != null) {
// // Parse line converting each string token into a Student object field
// String[] fields = inputLine.split(",");
// String lname = fields[2];
// String fname = fields[1];
// int age = new Integer(fields[0]);
// double gpa = new Double(fields[3]);
// String parentFname = fields[4];
// String parentLname = fields[5];
// // instantiate Student object from line in file and add to list
// obj.addStudent(fname, lname, age, gpa);
//
// //obj.load(new Student(fname, lname, age, gpa, parentFname, parentLname));
// }
// } catch (IOException e) {
// // catch IOException (and implicitly FileNotFoundException)
// e.printStackTrace();
// }
// return obj;
// }
// }