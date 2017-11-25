package edu.neu.csye6200;

public class Employee extends AbstractEmployee{

	private Double wage;
	
	@Override
	public Double getWage() {
		// TODO Auto-generated method stub
		return this.wage;
	}

	@Override
	public void setWage(double Wage) {
		this.wage = Wage;
		
	}

	public Employee() {
		super();
		wage = -1.0;
	}
	

}
