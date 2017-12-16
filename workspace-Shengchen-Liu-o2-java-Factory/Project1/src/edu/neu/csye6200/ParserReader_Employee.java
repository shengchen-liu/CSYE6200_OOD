package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParserReader_Employee {
	Company read(String fileName) {
		Company obj = new Company();
		try (BufferedReader inLine = new BufferedReader(new FileReader(fileName))) {
			String inputLine = null; // read one line from file at a time
			while ((inputLine = inLine.readLine()) != null) {
				// Parse line converting each string token into a Student object field
				String[] fields = inputLine.split(",");
				String lname = fields[2];
				String fname = fields[1];
				int age = new Integer(fields[0]);
				double wage = new Double(fields[3]);
				// instantiate Student object from line in file and add to list
				obj.load(new Employee(fname, lname, age, wage));
			}
		} catch (IOException e) {
			// catch IOException (and implicitly FileNotFoundException)
			e.printStackTrace();
		}
		return obj;
	}

}
