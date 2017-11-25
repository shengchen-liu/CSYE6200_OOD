package edu.neu.csye6200;

import java.util.Arrays;
import java.util.List;

public class DemoFunctional {
	public void findDan() {
		System.out.println(DemoFunctional.class.getSimpleName() + ".findDan()");
		// find dan in the following list of names
		final List<String> names = Arrays.asList("jim", "sue", "dan", "len", "zac");
		{
			boolean found = false;
			for (String name : names) {
				if (name.equals("dan")) {
					found = true;
					break;	// exit loop
				}
			}
			System.out.println("Imperative loop: TRUE or FALSE: You found dan! " + found);
		}
		{
			System.out.println("Declarative List.contains(): TRUE or FALSE: You found dan! " + names.contains("dan"));
			
		}
	}
	
	public void totalDiscountedPrice() {
		System.out.println(DemoFunctional.class.getSimpleName() + ".totalDiscountedPrice()");
		// Calculate the total price discounted by 10%: use the following list of prices
		final List<Double> prices = Arrays.asList(5.0,10.0,15.0,20.0);
		{
			double totalOfDiscountedPrices = 0.0;
			for (double price : prices) {
				totalOfDiscountedPrices += price * 0.9;	// 10 % discount
			}
			System.out.println("Imperative loop: Total: $" + totalOfDiscountedPrices);
		}
		{
			final Double totalOfDiscountedPrices = prices.stream().mapToDouble((Double price) -> price * 0.9).sum();
			System.out.println("Declarative stream: Total: $" + totalOfDiscountedPrices);
		}
		
	}

	public static void demo() {
		System.out.println("\n\n" + DemoFunctional.class.getSimpleName() + ".demo()");
		DemoFunctional obj = new DemoFunctional();
		
		obj.findDan();
		obj.totalDiscountedPrice();

	}
}
