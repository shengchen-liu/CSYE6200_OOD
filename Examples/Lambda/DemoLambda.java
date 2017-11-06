package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author 
 * http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html
 *
 */
public class DemoLambda {

	/**
	 * showList generic method for numbered output of collections of various type elements
	 * 
	 * @param title		Output title string
	 * @param l			Collection for output
	 */
	public <T> void showList(String title, List<T> l) {
		System.out.println(l.size() + title);
		int i = 1;		// 1 based numbering of elements
		for (T n : l) {
			System.out.print(i + ". " + n + " ");
			i++;
		}
		System.out.println();
	}

//	/**
//	 * showList method for numbered output of collections of String type elements
//	 * 
//	 * @param title		Output title string
//	 * @param l			Collection of Strings for output
//	 */
//	void showList(String title, List<String> l) {
//		System.out.println(l.size() + title);
//		for (String n : l) {
//			System.out.print(n +",");
//		}
//		System.out.println();
//	}
	
	/**
	 *  must be defined as member of top level (not-inner) class
	 * @author danielgmp
	 *
	 */
	@FunctionalInterface
	private interface GreatDivide {
		int divide(int t1, int t2);
	}

	void simpleFunctional() {
		System.out.println("Funtional InterfaceName implementationName = lambda, e.g. (x,y) -> (x/y) where x=21,y=3 result 7");
		GreatDivide intDivide = (int x, int y) -> x / y;
		System.out.println(intDivide.divide(21, 3));
	}

	void simpleSortLambdaIntegers() {
		System.out.println("simpleSortLambdaIntegers: Ascending sort with lambda implementing comparator interface: ");
		List<Integer>  numbers = new ArrayList<>(Arrays.asList(3,2,7,4,5,1,6));
		Collections.sort(numbers, (n1,n2) -> Integer.compare(n1, n2));
//		Collections.sort(numbers, (n1,n2) -> { return Integer.compare(n1, n2); });
		numbers.forEach(n -> System.out.print(n + " "));		
		System.out.println();
		// alternatives
//		Collections.sort(numbers, (n1,n2) -> n1 > n2 ? 1 : -1  );	// lambda return expression result
//		Collections.sort(numbers, (n1,n2) -> { return n1 > n2 ? 1 : -1; }  );	// lambda optional return statement requires semicolon and braces
//		Collections.sort(numbers, (n1,n2) -> { return Integer.compare(n1, n2); });	// lambda use method with return value
//		Collections.sort(numbers, (n1,n2) -> Integer.compare(n1, n2));	// lambda use single statement without return, braces or semicolon
//		Collections.sort(numbers, (Integer n1, Integer n2) -> Integer.compare(n1, n2));	// lambda parameters with optional types
//		showList(" integers in container in ascending order", numbers);	// call generic method with Integer types
	}
	
	void sortLambdaStrings() {
		{
			List<String> names = new ArrayList<String>(Arrays.asList("Moe", "Larry", "Curley"));
			Collections.sort(names, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			showList(" elements in container sorted in ascending order.", names);
		}

		{
			List<String> names = new ArrayList<String>(Arrays.asList("Moe", "Larry", "Curley"));
//			Collections.sort(names, (n1, n2) -> n1.compareTo(n2));		// lexagraphic ascending
			Collections.sort(names, (String n1, String n2) -> n2.compareTo(n1));	// lexagraphic descending
			showList(" elements in container sorted in descending order.", names);
			
			// use Stream API to map and re-sort collection
			names.stream()
			.map(String::toUpperCase)
			.sorted()		// ascending lexagraphic order
			.forEach(System.out::println);
		}
		{
			List<String> names = new ArrayList<String>(Arrays.asList("Moe", "Larry", "Curley"));
			names.sort((n1, n2) -> n1.compareTo(n2));
			showList(" elements in container sorted in ascending order.", names);
		}
	}
	
	void filterMapSortLambdaIntegers() {
		System.out.println("Use Java 8 Stream API to filter(ODD), map(x10), sort(ascending) and print the following integers in collection:");
		List<Integer>  numbers = new ArrayList<>(Arrays.asList(3,2,7,4,5,1,6));
		numbers.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		numbers.stream()
//		.filter(n -> n % 2 == 0)	// only even numbers
		.filter(n -> n % 2 == 1)	// only odd numbers
		.map(n->10*n)				// transform each integer
		.sorted()					// ascending sort
//		.forEach(System.out::print);
		.forEach(n -> System.out.print(n + ", "));		

		System.out.println();		
	}
	
	void runnableLambda() {
//		Runnable r = () -> System.out.println("lambda running a thread in background...");
//		Thread t = new Thread(r);
//		t.start();

		Runnable rLambda = () -> {
			System.out.println("\n lambda running a thread in background... "); 
			for (int n : Arrays.asList(1,2,3,4,5,6,7,8,9)) System.out.print(n); 
			System.out.println("\n ... lambda class thread Done!");
		};
		Runnable rAnonymous = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("\n anonymous class running a thread in the background... ");
				for (char n : Arrays.asList('a','b','c','d','e','f','g','h','i')) System.out.print(n); 
				System.out.println("\n ... anonymous class thread Done!");
			}
		};
		
		Thread tLambda = new Thread(rLambda);
		Thread tAnonymous = new Thread(rAnonymous);
		tLambda.start();
		tAnonymous.start();

	}
	
	@FunctionalInterface
	public interface Show<T> {
		void show(T t);
	}
	
	void genericFunctional() {
		List<SomeCommodity> shoppingList = new ArrayList<>();
		shoppingList.add(new SomeCommodity("iPhone", 399));
		shoppingList.add(new SomeCommodity("iPad", 599));
		shoppingList.add(new SomeCommodity("macBook", 1599));
		// use a lambda to implement out show functional interface
		Show<SomeCommodity> showPrice = o -> System.out.println(o.getName() + " YOURS for only $ " + o.getPrice());
		for (SomeCommodity item : shoppingList) {
			showPrice.show(item);
		}
	}

	/**
	 * filterLambda	create a collection of objects and a Predicate Interface Lambda implementation for a filtering criteria
	 * 
	 * REF: filter
	 */
	void filterLambda() {
		List<SomeCommodity> shoppingList = new ArrayList<>();
		shoppingList.add(new SomeCommodity("iPhone", 399));
		shoppingList.add(new SomeCommodity("iPad", 599));
		shoppingList.add(new SomeCommodity("macBook", 1599));
//		// use a lambda to implement out show functional interface
//		Show<SomeCommodity> showPrice = o -> System.out.println(o.getName() + " only $ " + o.getPrice());
//		for (SomeCommodity item : shoppingList) {
//			showPrice.show(item);
//		}
		// Lambda are applied to functional interfaces
		// use a lambda as in-line implementation for the java.util.Predicate functional interface
		double budget = 500.00;
		
		Predicate<SomeCommodity> overBudgetPredicate = o -> o.getPrice() > budget;
		filter (overBudgetPredicate, shoppingList);
		
//		Predicate<Thing> InBudgetPredicate = o -> o.getPrice() <= budget;
//		filter (InBudgetPredicate, shoppingList);
	}
	
	/**
	 * filter	show only elements in the supplied collection which meet the supplied criteria
	 * 
	 * @param predicate	lambda implemented interface for filter criteria
	 * @param items collection of items to filter with Stream API
	 */
	public  void filter(Predicate<SomeCommodity> predicate, List<SomeCommodity> items) {
		for (SomeCommodity item : items) {
			if (predicate.test(item)) {
				System.out.println("$ " + item.getPrice() + " is TOO RICH for my budget!");
			} else {
				System.out.println("$ " + item.getPrice() + " is within my budget!");
			}
		}
	}
	
	/**
	 * simpleStream
	 * Create a Collection to be used as a stream source for reduction, sorting and output
	 */
	public void simpleStream() {
		List<Integer> l = Arrays.asList(5,2,4,1,3);
		l.forEach(n -> System.out.print(n + " "));
		System.out.println("Reduce set of " + l.size() + " integers the odd subset and sort ascending");
		l.stream()
		.filter(n -> n % 2 == 1)	// ONLY odd
		.sorted()					// ascending
		.map(n -> 100 * n) 			// scale by 10
		.forEach(n -> System.out.print(n + ", "));
		System.out.println();
	}
	
	/**
	 * statesStream
	 * Create a Collection to be used as a stream source
	 */
	public void statesStream() {
		// fixed-size list backed by (with write-thru to) array
//		List<String> l = Arrays.asList("ma","ny","ct","vt","ri","nh","nv","nc","nd","wa","wv","ut","ca","az","al","ak","ok","pa","me","ms","il","id","mn","wy","mt","wi","ia","ar","hi","sd","sc","md","nj","de","ga","fl","mi","oh","in","or","ky","tn","va","mo","ks","co","la","tx","nm","ne");
		// grow-able list, no longer backed by array but Grow-able
		List<String> l = new ArrayList<>(Arrays.asList("ma","ny","ct","vt","ri","nh","nv","nc","nd","wa","wv","ut","ca","az","al","ak","ok","pa","me","ms","il","id","mn","wy","mt","wi","ia","ar","hi","sd","sc","md","nj","de","ga","fl","mi","oh","in","or","ky","tn","va","mo","ks","co","la","tx","nm","ne"));
//		l.add("dc");	// can NOT add to array backed container
		
		showList(" United States of America", l);
		
		// define a Lambda implemented predicate for a Stream filter criteria
		Predicate<String> nStates = s -> { return s.startsWith("u"); } ;
		filterStream(l, nStates);	// reduce, map, sort and print out using Stream API

		Collections.sort(l, (String s1, String s2) -> s1.compareTo(s2));
		showList(" United States of America", l);
		l.forEach(s -> System.out.print(s + " "));
		System.out.println();
	}
	
	/**
	 * filterStream
	 * Stream API based filter, map, sort and print out of supplied collection
	 * Refer to: simpleStream()
	 * @param predicate	Lambda implemented Predicate for use as filter criteria
	 * @param list	supplied collection for stream source
	 */
	public void filterStream(List<String> list, Predicate<String> predicate) {
		System.out.println("Use Stream API to fillter, map UPPERCASE and re-sort lexagraphic ascending collection.");
		list.stream()
			.filter(predicate)
//			.filter(s -> s.startsWith("n"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(s -> System.out.print(s + ", "));
//			.forEach(System.out::println);
		System.out.println();
	}
	
	public void simpleGeneric() {
		
	}
	
	public  void simplePredicate () {
		// create fixed write-thru list backed by array
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
		// java.util.functional.Predicate interface test method returns a boolean
		// implement with lambda
		Predicate<Integer> over5Predicate = n -> { return n > 5; }; 
		for (Integer n : ints) {
			if (over5Predicate.test(n)) {
				System.out.print(n + " <** ");
			} else {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	static void demo() {
		System.out.println("\n\n" + DemoLambda.class.getSimpleName() + ".demo()");
		DemoLambda obj = new DemoLambda();
		obj.simpleSortLambdaIntegers();
		obj.sortLambdaStrings();
		obj.filterMapSortLambdaIntegers();
		obj.simpleFunctional();
		obj.genericFunctional();
		obj.simpleStream();
		obj.simplePredicate();

//		obj.runnableLambda();
//		obj.filterLambda();
		obj.statesStream();
	}
}
