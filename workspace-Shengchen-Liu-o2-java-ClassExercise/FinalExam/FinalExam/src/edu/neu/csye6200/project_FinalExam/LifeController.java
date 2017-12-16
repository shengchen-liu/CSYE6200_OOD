package edu.neu.csye6200.project_FinalExam;
import java.util.ArrayList;
import java.util.List;

public class LifeController extends AbstractLife{
	private List<Person> people = new ArrayList<Person>();
	private List<Student> students = new ArrayList<Student>();
	
	@Override
	public void loadPersons(List<String> personIDCSV) {
		
		for (String line:personIDCSV) {
			Person p = new Person();
			Person p1 = p.parsePersonIDCSV(line);
			people.add(p1);
		}				
	}

	@Override
	public void loadStudents(List<String> personIDCSV) {
		for (Person p:people) {
			Student s = new Student();
//			Student s = (Student) p;
			s.setId(p.getId());
			s.setFirstName(p.getFirstName());
			s.setLastName(p.getLastName());
			s.setAge(p.getAge());
			s.setWage(p.getWage());
			s.setGPA(p.getGPA());
			students.add(s);
		}
		
	}

}
