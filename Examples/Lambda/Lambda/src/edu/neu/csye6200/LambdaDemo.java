package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public void sortStrings() {
		String[] strings = {"Zach", "dan", "jon", "sally", "Haoqi", "Able"};
		List<String> list = new ArrayList<>(Arrays.asList(strings));
		
		list.sort( (s1, s2) -> s1.compareTo(s2) );	// Java 8 lambda
		// Old Pre- Java 8 Anonymous inner class
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//		
//		list.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
		list.forEach(System.out::println);
	}
	public static void demo() {
		LambdaDemo obj = new LambdaDemo();
		
		obj.sortStrings();
	}

}
