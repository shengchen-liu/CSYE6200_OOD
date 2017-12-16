package edu.neu.csye6200.project_FinalExam;

import java.util.ArrayList;
import java.util.List;

public class Midterm {
	private double[] data = new double[3];
	private double sum = 0;

	public double[] getData() {
		return data;
	}

	public void setData(double[] data) {
		this.data = data;
	}

	public Midterm() {
		super();
		for (int i = 0; i < 3; i++) {
			data[i] = i + 1;
		}
	}

	public void showIntData() {
		System.out.println("Running method 'showIntData':");
		for (int i = 0; i < 3; i++) {
			System.out.println(data[i]);
		}
	}

	public void transformIntData() {
		this.sum = 0;
		for (int count = 0; count < 3; count++) {
			data[count] = data[count] + 1;
			sum = sum + data[count];
		}

		System.out.println("Running method 'transformIntData':");
		for (int i = 0; i < 3; i++) {
			System.out.println(data[i]);
		}
		sum = sum * 2;
		System.out.println("sum = " + sum);
	}

	public void TransformIntData1() {
		List<Double> LI = new ArrayList<Double>();
		this.sum = 0;
		for (int count = 0; count < 3; count++) {
			LI.add(data[count]);
		}
		System.out.println("Running method 'TransformIntData1':...");
		for (double i : LI) {
			i++;
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println("sum: " + sum);
	}
	
	public static void demo() {
		Midterm midterm = new Midterm();
		midterm.showIntData();
		midterm.transformIntData();
		
		Midterm midterm2 = new Midterm();
		midterm2.TransformIntData1();
	}

}
