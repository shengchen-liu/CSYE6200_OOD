package edu.neu.csye6200;

public class Student extends Person {
	private Double GPA;
	private String parentFname;
	private String parentLname;
	
	public String getParentFname() {
		return parentFname;
	}

	public void setParentFname(String parentFname) {
		this.parentFname = parentFname;
	}

	public String getParentLname() {
		return parentLname;
	}

	public void setParentLname(String parentLname) {
		this.parentLname = parentLname;
	}

	public Student() {
		super();
		super.setAge(20);
		super.setFirstName("firstStudent");
		super.setLastName("lastStudent");
		GPA = 0.0;
	}
	
	public Student(String fname, String lname, int age, double gpa) {
		super();
		super.setAge(age);
		super.setFirstName(fname);
		super.setLastName(lname);
		GPA = gpa;
	}
	
	public Student(String fname, String lname, int age, double gpa, String parentFname, String parentLname) {
		super();
		super.setAge(age);
		super.setFirstName(fname);
		super.setLastName(lname);
		GPA = gpa;
		this.setParentFname(parentFname);
		this.setParentLname(parentLname);
		
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	@Override
	public String speak() {
		return "My name is " + super.getFirstName() + " " + super.getLastName()+ " and I am a student." + " My GPA is: " + this.getGPA() 
				+ ". My parent is:" + this.getParentFname() + " "+ this.getParentLname();
	}
	public int compareStudent(Student student) {
		// TODO Auto-generated method stub
		//return super.compareTo(student);
		Double d = new Double (student.getGPA()*100 - this.getGPA()*100);
		int n = d.intValue();
		return n;
	}
	
	
@Override
public int compareTo(Person student) {
	// TODO Auto-generated method stub 
	int ret;
	ret = 0;
	if(student instanceof Student) {
		
		ret = compareStudent((Student)student);
		System.out.println(".");
	}
	return ret;
	
	//return compareStudent((Student)student);
//	Double d = new Double (getGPA() - this.getGPA());
//	int n = d.intValue();
//	return n;
}	
//	@Override
//	public int compareTo(Student student) {
//		return GPA.compareTo(student.GPA);
//        
//        //return this.GPA - student.name;
//    }   
	
	

}
