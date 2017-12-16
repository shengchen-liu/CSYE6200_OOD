package edu.neu.csye6200.project_FinalExam;

import java.util.List;

public abstract class AbstractLife {
	public abstract void loadPersons(List<String> personIDCSV);
	public abstract void loadStudents(List<String> personIDCSV);
	public abstract void loadEmployees(List<String> personIDCSV);
	
	public abstract void agePersons(int offset, int scale); 
	public abstract void scaleStudentsGPA(double offset, double scale); 
	public abstract void scaleEmployeeWages(double offset, double scale);
	
	public abstract void showPersons();
	public abstract void showStudents();
	public abstract void showEmployees();

	public abstract void sortPersonsByLastName();
	public abstract void sortStudentsByGPA();
	public abstract void sortEmployeesByWage();
}
