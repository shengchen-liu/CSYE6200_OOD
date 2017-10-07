package edu.neu.csye6200;

public class Shout {
//	private int age = 0;
//	private String fname = "John";
//	private char mi = 'C';
//	private String lname = "Doe";
	private int age;
	private String fname;
	private char mi;
	private String lname;
	
	public Shout() {
		super();
	}

	public Shout(int age, String fname, char mi, String lname) {
		super();
		this.age = age;
		this.fname = fname;
		this.mi = mi;
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public char getMi() {
		return mi;
	}

	public void setMi(char mi) {
		this.mi = mi;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
