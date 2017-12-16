package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Midterm {
	private double a;
	private double b;
	private double c;
	
	public Midterm() {
		super();
		this.a = 1;
		this.b = 2;
		this.c = 3;
	}
	
	
	
	public Midterm(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public void showIntData() {
		System.out.println("Running method 'showIntData': " + a + ", "  + b + ", " + c);
	}
	
	public void transformIntData() {
		a++;
		b++;
		c++;
		double sum = a + b + c;
		sum = sum*2;
		System.out.println("Running method 'transformIntData': " + a + ", "  + b + ", " + c + ", sum =" + sum);
	}
	
	public void TransformIntData1() {
		List<Double> LI = new ArrayList<Double>();
		double sum = 0;
		LI.add(a);
		LI.add(b);
		LI.add(c);
		System.out.println("Running method 'TransformIntData1':...");
		for (double i:LI) {
			i++;
			sum = sum + i;
			System.out.println(i);
		}
		sum = sum * 2;
		System.out.println("sum: " + sum);
	}

	public void TransformIntData2() {
		List<Double> LD = new ArrayList<Double>();
		double sum = 0;
		LD.add(a);
		LD.add(b);
		LD.add(c);
		System.out.println("Running method 'TransformIntData2':...");
		for (double d:LD) {
			d++;
			sum = sum + d;
			System.out.println(d);
		}
		sum = sum * 2;
		System.out.println("sum: " + sum);
	}
}
