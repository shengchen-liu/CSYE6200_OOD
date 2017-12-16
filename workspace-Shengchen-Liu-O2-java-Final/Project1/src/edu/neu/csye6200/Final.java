package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Final {

	/**
	 * Final exam programming assignment:
	 * 
	 * Given a Driver class with a main method which only executes Final.demo(), And
	 * given this Final class (without my working solutions) with the supplied
	 * demo() method. Student must implement:
	 * 
	 * sortingTest() method in Final class alphaThreadsTest() method in Final class
	 * 
	 * and demonstrate by executing the following supplied demo() from Driver.
	 * 
	 */
	public static void demo() {
		Final obj = new Final();

		obj.sortingTest();
		obj.alphaThreadsTest();
	}

	/**
	 * 80 TOTAL POINTS sortingTest:
	 * 
	 * 20 POINTS: ALL OUTPUT MUST BE DISPLAYED ON STANDARD OUTPUT USING ONLY '*'
	 * CHARACTERS, e.g. 1=*, 3=***
	 * 
	 * Given the supplied data array: Integer [] data = {5,1,4,2,3};
	 * 
	 * 10 POINTS: Sort initial data ascending and DISPLAY on standard output. 10
	 * POINTS: Sort initial data descending and DISPLAY on standard output.
	 * 
	 * 10 POINTS: Sort initial data OFFSET by 10 ascending and DISPLAY on standard
	 * output. 10 POINTS: Sort initial data OFFSET by 10 descending and DISPLAY on
	 * standard output.
	 * 
	 * 10 POINTS: Sort initial data SCALED by 10 ascending and DISPLAY on standard
	 * output. 10 POINTS: Sort initial data SCALED by 10 descending and DISPLAY on
	 * standard output. .
	 */
	public void sortingTest() {
		System.out.println("\n\t" + this.getClass().getName() + ".sortingTest() starting... \n");

		Integer[] data = { 5, 1, 4, 2, 3 };
		List<Integer> list = new ArrayList<Integer>();

		for (int count = 0; count < data.length; count++) {
			list.add(data[count]);
		}
		// 1. Sort initial data ascending and DISPLAY on standard output.
		System.out.println("Q1:");
		Collections.sort(list);
		for (int i : list) {
			this.stdOut(i);
		}

		// 2. Sort initial data descending and DISPLAY on standard output.
		System.out.println("Q2:");
		Collections.sort(list, Collections.reverseOrder());
		for (int i : list) {
			this.stdOut(i);
		}

		// 3. Sort initial data OFFSET by 10 ascending and DISPLAY on standard output.
		System.out.println("Q3:");
		List<Integer> list1 = new ArrayList<>();
		for (int count = 0; count < data.length; count++) {
			list1.add(data[count] + 10);
		}
		Collections.sort(list1);
		for (int i : list1) {
			this.stdOut(i);
		}

		// 4. Sort initial data OFFSET by 10 descending and DISPLAY on standard output.
		System.out.println("Q4:");
		Collections.sort(list1, Collections.reverseOrder());
		for (int i : list1) {
			this.stdOut(i);
		}

		// 5. Sort initial data SCALED by 10 ascending and DISPLAY on standard output.
		System.out.println("Q5:");
		List<Integer> list2 = new ArrayList<>();
		for (int count = 0; count < data.length; count++) {
			list2.add(data[count] * 10);
		}
		Collections.sort(list2);
		for (int i : list2) {
			this.stdOut(i);
		}

		// 6. Sort initial data OFFSET by 10 descending and DISPLAY on standard output.
		System.out.println("Q6:");
		Collections.sort(list2, Collections.reverseOrder());
		for (int i : list2) {
			this.stdOut(i);
		}

		System.out.println("\n" + this.getClass().getName() + ".sortingTest() done! \n");

	}

	public void stdOut(int num) {
		for (int count = 0; count < num; count++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	/**
	 * 20 TOTAL POINTS: alphaThreadsTest
	 * 
	 * Using TWO threads, t1 and t2: WHERE t1 output to console entire alphabet in
	 * order in LOWERCASE, alternating with t2 output; WHERE t2 output to console
	 * entire alphabet in order in UPERCASE, alternating with t1 output; TO RESULT
	 * IN two threads with coordinated console output as follows:
	 * 
	 * aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ
	 * 
	 */
	public void alphaThreadsTest() {
		System.out.println("\n\t" + this.getClass().getName() + ".alphaThreads() starting...\n");
		String alpha = "abcdefghijklmnopqrstuvwxyz";

		char[] chars = alpha.toCharArray();
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < chars.length; i++) {
			strings.add(String.valueOf(chars[i]));
		}

		MyThread.runnableAlpha(strings);


	}

}

class MyThread extends Thread {
	
	static void runnableAlpha(List<String> strings) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				for (String s:strings) {
					System.out.print(s.toLowerCase());
					try {
		                Thread.sleep(200);
		            } catch (InterruptedException e) {

		            }
				}
				
			}
		};
		
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				for (String s:strings) {

					System.out.print(s.toUpperCase());
					try {
		                Thread.sleep(200);
		            } catch (InterruptedException e) {

		            }
				}
			}
		};
		
		Thread thread_1 = new Thread(r1);
		thread_1.start();
		Thread thread_2 = new Thread(r2);
		thread_2.start();

	}
	
	
}