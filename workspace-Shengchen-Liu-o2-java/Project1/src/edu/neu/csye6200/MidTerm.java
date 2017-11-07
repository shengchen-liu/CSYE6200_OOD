package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class MidTerm {
	// 1,2,3
	// 1. 20 POINTS: create a showIntData() method.
	//
	// 2. 40 POINTS: create a transformIntData() method: add 1 to EACH data element
	// and then multiply the resulting sum by 2 AND and show all data;
	//
	// 3. 80 POINTS: create a listIteratorTransformIntData1() method:Use
	// ListIterator to transform (add 1 and multiply sum by 2) the original data and
	// show the transformed data;
	//
	// 4. 60 POINTS: create a listIteratorTransformIntData2() method: Repeat use of
	// ListIterator (transform data by adding 1 and multiplying sum by 2) but for
	// the following data: 1.1, 2.1, 3.1
    private int a = 1;
    private int b = 2;
    private int c = 3;
	
    private double aa = 1.1;
    private double bb = 2.1;
    private double cc = 3.1;
    
	public MidTerm() {
		super();

	}

	public void showIntData() {
		System.out.println("running showIntData...");
		System.out.println(a + ", " + b + "," + c);

	}
	
	public void transformIntData() {
		System.out.println("transformIntData...");
	    int sum = 0;
	    a = a + 1;
	    b = b + 1;
	    c = c + 1;
	    sum = a + b + c;
	    sum = sum *2;
	    System.out.println(a + ", " + b + "," + c);
		System.out.println("The sum is "+ sum);
	}
	
	public void listIteratorTransformIntData1() {
		System.out.println("listIteratorTransformIntData1...");
		int sum = 0;
		List<Integer> data = new ArrayList<Integer>();
	    int a = 1;
	    int b = 2;
	    int c = 3;
		
		data.add(a);
		data.add(b);
		data.add(c);
		
		for (int d: data) {
			d = d + 1;
			sum = sum + d;
			System.out.println(d);
		}
		sum = sum * 2;
		System.out.println("The sum is "+ sum);
		
	}
	public void listIteratorTransformIntData2() {
		System.out.println("listIteratorTransformIntData2...");
		List<Double> data2 = new ArrayList<Double>();
		double sum = 0;
	
		data2.add(aa);
		data2.add(bb);
		data2.add(cc);
		for (double d: data2) {
			d = d + 1;
			sum = sum + d;
			System.out.println(d);
		}
		sum = sum * 2;
		System.out.println("The sum is "+ sum);
		
	}
}
