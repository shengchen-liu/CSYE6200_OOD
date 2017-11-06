package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Midterm {
	private int a;
	private int b;
	private int c;
	private double aa;
	private double bb;
	private double cc;
	
	public Midterm() {
		super();
		this.a = 1;
		this.b = 2;
		this.c = 3;
	}
	
	
	
	public Midterm(double aa, double bb, double cc) {
		super();
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}



	public void showIntData() {
		System.out.println("Running method 'showIntData': " + a + ", "  + b + ", " + c);
	}
	
	public void transformIntData() {
		a++;
		b++;
		c++;
		int sum = a + b + c;
		sum = sum*2;
		System.out.println("Running method 'transformIntData': " + a + ", "  + b + ", " + c + ", sum =" + sum);
	}
	
	public void TransformIntData1() {
		List<Integer> LI = new ArrayList<Integer>();
		int sum = 0;
		LI.add(a);
		LI.add(b);
		LI.add(c);
		System.out.println("Running method 'TransformIntData1':...");
		for (int i:LI) {
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
		LD.add(aa);
		LD.add(bb);
		LD.add(cc);
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
