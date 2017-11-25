package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 public class DemoAlgorithm {

	public void demoSort() {
		{
			System.out.println("demoSort");
			Integer[] numbers = { 9, 7, 23, 3, 5 };	//boxed integers
			List<Integer> list = new ArrayList<>(Arrays.asList(numbers));

			Collections.sort(list);		// 3, 5, 7, 9, 23,
			System.out.println(list.size() + " elements in container.");
			for (Integer n : list) {
				System.out.print(n + ", ");
			}
			System.out.println();

			Arrays.sort(numbers); 		// 3, 5, 7, 9, 23,
			// Arrays.sort(numbers,1,3); // 9, 7, 23, 3, 5,
			// Arrays.sort(numbers, c);
			System.out.println(numbers.length + " elements in container.");
			for (int i : numbers) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
		{
			String[] names = { "Jen", "Zac", "Dan" };
			List<String> listOriginal = Arrays.asList(names);
			listOriginal.set(2, "Daniel");	// writes through to array
//			listOriginal.add("Mary");  // cannot add to fixed size list
			List<String> list = new ArrayList<>(listOriginal);
//			List<String> list = new ArrayList<>(Arrays.asList(names));
			list.set(0, "Jennifer");
			list.add("Ed");	// add to list
			list.set(3, "Edward");

			Collections.sort(list);	// Dan, Jen, Zac,
			System.out.println(list.size() + " elements in container.");
			for (String n : list) {
				System.out.print(n + ", ");
			}
			System.out.println();

			Arrays.sort(names); 	// Dan, Jen, Zac, 
			// Arrays.sort(names, c);
			System.out.println(names.length + " elements in container.");
			for (String n : names) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}

	public void demoCustomSort() {
		{
			System.out.println("demoCustomSort");
			Integer[] numbers = { 9, 7, 23, 3, 5 };	//boxed integers
			List<Integer> list = new ArrayList<>(Arrays.asList(numbers));

			// use Comparator anonymous inner class
			Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.intValue() - o2.intValue();
				}
			});		// 3, 5, 7, 9, 23,
			System.out.println(list.size() + " elements in container.");
			for (Integer n : list) {
				System.out.print(n + ", ");
			}
			System.out.println();

			Arrays.sort(numbers); 		// 3, 5, 7, 9, 23,
			// Arrays.sort(numbers,1,3); // 9, 7, 23, 3, 5,
			// Arrays.sort(numbers, c);
			System.out.println(numbers.length + " elements in container.");
			for (int i : numbers) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
		{
			String[] names = { "BB", "AA", "aa", "cc", "dd", "DD", "CC", "A", "a", "aA", "bb" };
//			String[] names = { "Jen", "Zac", "Dan" };
			List<String> list = new ArrayList<>(Arrays.asList(names));

			Collections.sort(list, String.CASE_INSENSITIVE_ORDER);	// Dan, Jen, Zac,
			System.out.println(list.size() + " elements in container.");
			for (String n : list) {
				System.out.print(n + ", ");
			}
			System.out.println();

			Arrays.sort(names, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
//					return	o1.compareTo(o2);	// lexicographic order
					return	o2.compareTo(o1);	// reverse lexicographic order
//					return	o1.compareToIgnoreCase(o2);	// lexicographic order ignoring case
				}
			}); 	// Dan, Jen, Zac, 
			// Arrays.sort(names, c);
			System.out.println(names.length + " elements in container.");
			for (String n : names) {
				System.out.print(n + ", ");
			}
			System.out.println();

			Arrays.sort(names, new AlphabetizeStrings()); 	// Dan, Jen, Zac, 
			// Arrays.sort(names, c);
			System.out.println(names.length + " elements in container.");
			for (String n : names) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}

	void test() {
		String [] names = {"A","Z","Q","P"};
		
		Arrays.sort(names);
		System.out.println(names.length + " elements in container.");
		for (String n : names) {
			System.out.print(n + ", ");
		}
		System.out.println();

		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		System.out.println(names.length + " elements in container.");
		for (String n : names) {
			System.out.print(n + ", ");
		}
		System.out.println();
	}
	
	public void demoCount() {
		String[] names = { "Jen", "Zac", "Dan" };
		List<String> list = new ArrayList<>(Arrays.asList(names));
		list.forEach(name -> System.out.print(name + ", "));
		String target = "Dan";
		int count = Collections.frequency(list, target);	// count the number of occurrences of "Dan" in collection
		System.out.println(" includes " + count + " occurrence(s) of the name '" + target +"'");
	}
	
	public void demoMinMax() {
		String [] aNames = { "Eve", "Zachery", "Adam", "Daniel" };
		List<String> names = new ArrayList<String>(Arrays.asList(aNames));
		names.forEach(n -> System.out.print(n + ", "));
		System.out.println(" includes the max name '" + Collections.max(names) + "'"
				+ " AND the min name '" + Collections.min(names) + "'");
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.forEach(n -> System.out.print(n +", "));
		System.out.println(" includes the max number '" + Collections.max(numbers) + "'"
				+ " AND the min number '" + Collections.min(numbers) + "'");
	}
	
	public void demoSearch() {
		String [] aNames = { "Eve", "Zachery", "Adam", "Daniel" };
		List<String> names = new ArrayList<String>(Arrays.asList(aNames));
		String target = "Abigail";
//		names.add(target);
		names.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		Collections.sort(names);
		names.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		int pos = Collections.binarySearch(names, target);
		if (pos < 0) {
			names.add(-pos-1, target);
		}
		names.forEach(n -> System.out.print(n + ", "));
		System.out.println();
	}

	static public void demo() {
		DemoAlgorithm obj = new DemoAlgorithm();
		obj.demoSort();
		obj.demoCustomSort();
		obj.test();
		obj.demoCount();
		obj.demoMinMax();
		obj.demoSearch();
	}
}
