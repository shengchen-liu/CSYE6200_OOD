package edu.neu.csye6200.esper6_1_0;

import java.util.Arrays;

public class MyThread extends Thread {

	public void run() {
		System.out.println("\n\t Hello for class MyThread run() method. \n\n");
	}
	
	void simpleLambdaRunnable() {
		Runnable r = () -> System.out.println("MyThread.simpleLambdaRunnable(): Lambda 'r' running a thread in background...");
		Thread t = new Thread(r);
		t.start();		
	}
	
	void simpleAnonymousRunnable() {
		Runnable rAnonymous = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("\n MyThread.simpleAnonymousRunnable(): anonymous class running a thread in the background... ");
				for (char n : Arrays.asList('a','b','c','d','e','f','g','h','i')) System.out.print(n); 
				System.out.println("\n ... anonymous class thread Done!");
			}
		};
		
		Thread tAnonymous = new Thread(rAnonymous);
		tAnonymous.start();
	}
	
	void runnableLambda() {

		Runnable rLambda = () -> {
			System.out.println("\n MyThread.runnableLambda(): lambda rLambda running a thread in background... "); 
			for (int n : Arrays.asList(1,2,3,4,5,6,7,8,9)) System.out.print(n); 
			System.out.println("\n ... lambda rLambda thread Done!");
		};
		Runnable rAnonymous = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("\n MyThread.runnableLambda(): anonymous class running a thread in the background... ");
				for (char n : Arrays.asList('a','b','c','d','e','f','g','h','i')) System.out.print(n); 
				System.out.println("\n ... anonymous class thread Done!");
			}
		};
		
		Thread tLambda = new Thread(rLambda);
		Thread tAnonymous = new Thread(rAnonymous);
		tLambda.start();
		tAnonymous.start();

	}
	
	public static void demo(String[] args) {
		(new MyThread()).start();  // start() inherited from Thread class

		MyThread obj = new MyThread();
		obj.simpleAnonymousRunnable();
		obj.simpleLambdaRunnable();
		obj.runnableLambda();

	}

}