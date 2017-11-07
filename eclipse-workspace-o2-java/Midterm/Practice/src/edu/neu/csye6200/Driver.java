package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Names = new ArrayList<String>();
		Names.add("BBB");
		Names.add("CC");
		Names.add("aa");
		
		Collections.sort(Names, new Comparator<String>() {

			@Override
			public int compare(String n1, String n2) {
				// TODO Auto-generated method stub
				return n2.compareTo(n1);
			}
		});
		System.out.println(Names);
		
		// Polymorphism
		// Method overloading , static , compile-time
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person());
		persons.add(new Person("Jordan", "Micheal", 23));
		persons.add(new Person("Wiggins", "Andrew", 19));
		persons.add(new Person("Webber", "Chirs", 27));
		
		for (Person p: persons) {
			System.out.println(p.speak());
		}
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student());
		students.add(new Student("A", "Kevin", 16, 3.5));
		students.add(new Student("D", "Scott", 24, 2.6));
		
		for (Student s:students) {
			System.out.println(s.speak());
		}
		
		// BufferedReader
		String fileName = "students2.csv";		
		List<Student> students2 = new ArrayList<Student>();
		List<Person> persons2 = new ArrayList<Person>();
		
		try( BufferedReader inLine = new BufferedReader( new FileReader(fileName));
				){
			String inputLine = null;
			while ((inputLine = inLine.readLine()) != null){
				String[] fields = inputLine.split(",");
				int age = new Integer(fields[0]);
				String fname = fields[1];			
				String lname = fields[2];
				double gpa = new Double(fields[3]);
				
				String parentFname = fields[4];
				String parentLname = fields[5];
				persons2.add(new Person ( fname, lname, age));
				students2.add(new Student (fname,lname,age,gpa,parentFname,parentLname));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		for (Person p: persons2) {
			System.out.println(p.speak());
		}
		
		String[] fiveNames = {"Dan", "Jim", "Eve", "Ina"};
		String fileName_write = "new_students.csv";
		// try with resources: all resources in () are closed at conclusion of try clause
		try ( // open output stream to output file for writing purpose.
			FileWriter fw = new FileWriter(fileName_write);
			BufferedWriter out= new BufferedWriter(fw);
			) {
			System.out.println("BufferedWriter: "+ " write " + fiveNames.length + "items");
			for (String name : fiveNames) {
				out.write(name);
				out.newLine();
			}
				out.flush();
			} catch (Exception e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// sort using Comparator
		List<Person> persons3 = new ArrayList<Person>();
		persons3.add(new Person("ccc", "c",20));
		persons3.add(new Person("AAA","c", 30));
		persons3.add(new Person("bbb", "b", 10));
		persons3.add(new Person("ddd","d",40));
		Collections.sort(persons3);
		for (Person p: persons3) {
			System.out.println(p.speak());
		}
		}
	

		

}
