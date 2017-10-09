package com.neu.csye.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String args[]) {

		List<Student> studentList = new ArrayList<>();
		try (BufferedReader inLine = new BufferedReader(new FileReader("students2.csv"));) {
			String inputLine = null; // read one line from file at a time
			while ((inputLine = inLine.readLine()) != null) {
				String[] fields = inputLine.split(",");
				int age = new Integer(fields[0]);
				String fname = fields[1];
				String lname = fields[2];
				Double gpa = new Double(fields[3]);
				studentList.add(new Student(fname, lname, age, gpa));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Student student: studentList){
			System.out.println(studentList);
		}
	}
	
}
