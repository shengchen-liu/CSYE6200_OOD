package edu.neu.csye6200;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * class DemoContainer
 * Show the use of various java container classes.
 * 
 * @author danielgmp
 *
 */
public class DemoContainer {
	/**
	 * class SmallPerson
	 * use for sorting, nothing more
	 */
	private class InnerPerson {
		private String fName = "john";
		private String lName = "doe";
		private int age = 1;
		
		public InnerPerson(String fName, String lName, int age) {
			super();
			this.fName = fName;
			this.lName = lName;
			this.age = age;
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "[" + this.getfName() 
					+ " " + this.getlName()
					+ ", age: " + this.getAge() +"]";
		}
	}
	
	// fixed array of strings constants
	private static final String[] nameList = { "Brandy", "Stanley", "Arlene", "Lynda", "Donald", "Cheryl", "Richard",
			"Susan", "Anderson", "Rebeckah", "Eve", "Ruth", "Yvette", "Jim", "Zechariah", "Samson", "Elizabeth",
			"Matthew", "Hal", "Adam", "Al", "Esther" };

	private enum Container {
		CON_ARRAYLIST, CON_VECTOR, CON_LINKEDLIST, CON_CUSTOM
	}

	private enum Algorithm {
		ALG_SORT, ALG_BINARY_SEARCH, ALG_SIZE, ALG_COMPARE, ALG_ALPHA_IGNORE_CASE, ALG_NONE
	}

	public DemoContainer() {
		// TODO Auto-generated constructor stub
	}
	
	public void sortNameList() {
		System.out.println(DemoContainer.class.getSimpleName() + ".sortNameList()");
		// instantiate a container to hold string names
		List<String> names = new ArrayList<>();	// compiler infers parameterized type for constructor
		// add names to the container
		names.add("Zachery");
		names.add("Abe");
		names.add("Eve");
		Collections.sort(names);
		// show the names in the container
		System.out.println(names.size() + " names in this collection.");
		for (String name : names) {
			System.out.println(name +", ");
		}
		System.out.println();
	}
	
	public void sortBoxedIntList() {
		System.out.println(DemoContainer.class.getSimpleName() + ".sortBoxedIntList()");
		// instantiate a container to hold string names
		List<Integer> numbers = new ArrayList<>();	// compiler infers parameterized type for constructor
		// add names to the container
		numbers.add(new Integer(2));	// wrap int in Integer class
		numbers.add(3);					// java auto boxing wraps int in Integer class
		numbers.add(1);
		Collections.sort(numbers);
		// show the names in the container
		System.out.println(numbers.size() + " numbers in this collection.");
		for (Integer number : numbers) {
			System.out.println(number +", ");
		}
		System.out.println();
	}
	
	public void sortSimpleNumberList() {
		System.out.println(DemoContainer.class.getSimpleName() + ".sortSimpleNumberList()");
		List<Integer> numbers = null;	// declare variable for reference type (i.e. object)
		numbers = new ArrayList<Integer>();	// instantiate sequential collection object
		// add numbers to collection
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		for (int n : numbers) {
			System.out.print(n+",");
		}
		System.out.println();
		Collections.sort(numbers);	// sort, natural order
		for (int n : numbers) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	
	public void sortNumberList() {
		System.out.println(DemoContainer.class.getSimpleName() + ".sortNumberList()");
		// create an array of integers: Arrays.asList returns a fixed length list
//		List<Integer> numbers = Arrays.asList(5,3,1,2,4); // numbers.add throws UnsupportedOperationException
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5,3,1,2,4));
		// add numbers to collection
		numbers.add(8);
		numbers.add(6);
		numbers.add(7);
		for (int n : numbers) {
			System.out.print(n+",");
		}
		System.out.println();
		Collections.sort(numbers);	// sort, natural order
		for (int n : numbers) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	
	public void sortStringList() {
		System.out.println(DemoContainer.class.getSimpleName() + ".sortSrtingList()");
		List<String> names = new ArrayList<String>();
		
		// add elements to collection
		names.add("Adam");
		names.add("Eve");
		names.add("Marilyn");
		names.add("Robin");
		names.add("William");
		names.add("Devon");
		names.add("Sylvester");

		Collections.sort(names, new Comparator<String>() {
			// sort collection by element length
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});

		System.out.println("Sort lexicographically.");
		Collections.sort(names, new Comparator<String>() {
			// sort collection by element length
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		// show collection
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();

	}
	
//	public void sortStudent() {
//		List<Student> names = new ArrayList<Student>();
//		
//		// create students
//		Student drew =
//				new Student("Drew", "Jones", 24, 3.34, "James", "Jones");
//		Student eve =
//				new Student("Eve", "Smith", 20, 3.33, "Daniel", "James");
//		Student caynon =
//				new Student("Caynon", "Carver", 21, 3.91, "Adam", "Carver");
//		Student robin =
//				new Student("Robin", "Carver", 23, 3.56, "Adam", "Carver");
//
//		// add elements to collection
//		
//		names.add(drew);
//		names.add(eve);
//		names.add(caynon);
//		names.add(robin);
//		
//
//		System.out.println("RANK Students: Sort Students by GPA");
////		Collections.sort(names, Comparator.comparing(Student::getGpa));
//		Collections.sort(names, (s1, s2) -> { return Double.compare(s2.getGpa(), s1.getGpa()); }); // lexagraphic ascending
//		names.forEach((name) -> {System.out.println(
//				name.getLname()
//				+ ", " + name.getFname()
//				+", Age " + name.getAge()
//				+", GPA: " + name.getGpa()
//				);});	
//		
//		System.out.println("Sort Students by GPA LOWEST to HIGHEST");
//		// use Student::getGpa() method reference to instrument sort
//		names.sort(Comparator.comparing(Student::getGpa));
//		names.forEach((name) -> {System.out.println(
//				name.getLname()
//				+ ", " + name.getFname()
//				+", Age " + name.getAge()
//				+", GPA: " + name.getGpa()
//				);});
//
//		System.out.println("Sort Students: youngest first");
//		// use Student::get() method reference to instrument sort
//		names.sort(Comparator.comparing(Student::getAge));
//		names.forEach((name) -> {System.out.println(
//				name.getLname()
//				+ ", " + name.getFname()
//				+", Age " + name.getAge()
//				+", GPA: " + name.getGpa()
//				);});
//
//		System.out.println("Sort Students alphabetically by last name.");
//		Collections.sort(names, (s1, s2) -> s1.getLname().compareTo(s2.getLname())); // lexagraphic ascending
//		names.forEach((name) -> {System.out.println(
//				name.getLname()
//				+ ", " + name.getFname()
//				+", Age " + name.getAge()
//				+", GPA: " + name.getGpa()
//				);});
//		
//		System.out.println("Sort Students alphabetically BACKWARDS by last name.");
//		Collections.sort(names, (s1, s2) -> s2.getLname().compareTo(s1.getLname())); // lexagraphic ascending
//		names.forEach((name) -> {System.out.println(
//				name.getLname()
//				+ ", " + name.getFname()
//				+", Age " + name.getAge()
//				+", GPA: " + name.getGpa()
//				);});
//
//		System.out.println("Sort Students alphabetically by first name.");
//		Collections.sort(names, (Student s1, Student s2) -> s1.getFname().compareTo(s2.getFname()));	// lexagraphic descending
//		names.forEach((name) -> {System.out.println(
//				name.getLname()
//				+ ", " + name.getFname()
//				+", Age " + name.getAge()
//				+", GPA: " + name.getGpa()
//				);});
//
//		
//		// use anonymous inner class to sort students by age
//		System.out.println("Sort Students: ELDEST first");
//		Collections.sort(names, new Comparator<Student>() {
//			public int compare(Student o1, Student o2) {
////				return o1.getAge() - o2.getAge();	// ascending, youngest first
//				return o2.getAge() - o1.getAge();	// descending, eldest first
//			}
//		});		
//		
//		// show collection
//		for (Student name : names) {
////			System.out.println(
////					name.getFname());
//			System.out.println(
//					name.getLname()
//					+ ", " + name.getFname()
//					+", Age " + name.getAge()
//					+", GPA: " + name.getGpa()
//					);
//		}
//		System.out.println();
//		
//		// rank students by GPA
//		System.out.println("Rank Students: Sort Students by GPA");
//		Collections.sort(names, new Comparator<Student>() {
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o2.getGpa(), o1.getGpa());
//			}
//		});
//		
//		// show collection
//		for (Student name : names) {
////			System.out.println(
////					name.getFname());
//			System.out.println(
//					name.getLname()
//					+ ", " + name.getFname()
//					+", Age " + name.getAge()
//					+", GPA: " + name.getGpa()
//					);
//		}
//		System.out.println();
//	}
	
	public void useArray() {
		// declare and initialize array with three names
		String[] threeNames = new String[3];
		
		threeNames[0] = "Jameson";
		threeNames[1] = "Yvette";
		threeNames[2] = "Allan";
		
		System.out.println(
				this.getClass().getSimpleName()
				+ ": useArray"
				+ ": Showing " + threeNames.length + " items"
				);
		for (String name : threeNames) {
			System.out.print(name +", ");
		}
		System.out.println();

		char[] threeChar = {'A', 'B', 'C'};
		System.out.println(
				this.getClass().getSimpleName()
				+ ": useArray"
				+ ": Showing " + threeChar.length + " items"
				);
		for (char name : threeChar) {
			System.out.print(name +", ");
		}
		System.out.println();

		int[] threeNumbers = { 1,2,3 };
		System.out.println(
				this.getClass().getSimpleName()
				+ ": useArray"
				+ ": Showing " + threeNumbers.length + " items"
				);
		for (int number : threeNumbers) {
			System.out.print(number +", ");
		}
		System.out.println();
		
		String[] threeFruit = {"Apple", "Pear", "Orange"};
		System.out.println(
				this.getClass().getSimpleName()
				+ ": useArray"
				+ ": Showing " + threeFruit.length + " items"
				);
		for (String fruit : threeFruit) {
			System.out.print(fruit +", ");
		}
		System.out.println();
		
	}
	
	public void useArrayList() {
		List<String> col = new ArrayList<String>();
		
		col.add("Peter");
		col.add("Paul");
		col.add("Mary");
		
		System.out.println(
				this.getClass().getSimpleName()
				+ ": useArrayList"
				+ ": Showing " + col.size() + " items"
				);
		for (String item : col) {
			System.out.print(item +", ");
		}
		System.out.println();

		Iterator<String> it = col.iterator();		
		while (it.hasNext()) {
			System.out.print(it.next() +", ");
		}
		System.out.println();
		
		ListIterator<String> it2 = col.listIterator();
		System.out.println();
		while (it2.hasNext()) {
			String item = it2.next();
			item = item.toUpperCase() + ", ";
			it2.set(item);  // only in ListIterator
			System.out.print(item +", ");
		}
		System.out.println();
	}

	public void useMap() {
		// HashMap: unsynchronized, allows null
		Map<String, String> states = new HashMap<String, String>();
		states.put("CT", "Connecticut");
		states.put("MA", "Massachusettes");
		states.put("ME", "Maine");
		states.put("NH", "New Hampshire");
		states.put("NJ", "New Jersey");
		states.put("NY", "New York");
		System.out.println("Get NY: " + states.get("NY"));
		System.out.println("Get NJ: " + states.get("NJ"));
		// show key, value pairs contained in map
		for (Entry<String, String> e : states.entrySet()) {
			System.out.println("Entry: " + e.getKey() + " : " + e.getValue());
		}
		
		// HashTable: thread safe (synchronized); disallow nulls
		Map<String, String> m = new Hashtable<String, String>(states);
		System.out.println("Get CT: " + m.get("CT"));
		System.out.println("Get MA: " + m.get("MA"));

		Map<Integer, String> jobCode = new HashMap<Integer, String>();
		jobCode.put(1, "Program Manager");
		jobCode.put(5, "Administrator");
		jobCode.put(7, "System Admin");
		System.out.println("Get 5: " + jobCode.get(5));
		System.out.println("Get 1: " + jobCode.get(1));
		
		// show key, value pairs contained in map
		for (Entry<Integer, String> e : jobCode.entrySet()) {
			System.out.println("Entry: " + e.getKey() + " : " + e.getValue());
		}
		// show keys only
		for (int i : jobCode.keySet()) {
			System.out.println("Key: " + i);
		}
		// show values only
		for (String s : jobCode.values()) {
			System.out.println("Value: " + s);
		}
	}
	
	public void useIterator() {
		// Use Integer objects to wrap int
		// collections are not for primitive types
		List<Integer> numbers = new ArrayList<Integer>();
		// primitive type int is boxed in Integer object
		// because primitive types cannot be added to collection
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);		
		
		System.out.println(this.getClass().getSimpleName()
				+ ": useIterator: Showing "
				+ numbers.size()
				+ " items (forwards and reverse):"
				);

		System.out.println("iterate forward through collection");
		ListIterator<Integer> it = numbers.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() +", ");
		}
		System.out.println();
		System.out.println("iterate reverse through collection");
		while (it.hasPrevious()) {
			System.out.print(it.previous() +", ");
		}
		System.out.println();
		System.out.println("iterate forward adding 10 to each element in collection");
		while (it.hasNext()) {
			Integer x = it.next();
			x += 10;
			System.out.print(x +", ");
		}
		System.out.println();
	}
	
	public void useLinkedList() {
		List<String> col = new LinkedList<String>();
		
		col.add("Peter");
		col.add("Paul");
		col.add("Mary");
		
		// listIterator allows modifying (set) of items
		// while Iterator does not
		ListIterator<String> it = col.listIterator();
//		Iterator<String> it = col.iterator();
		while(it.hasNext()) {
			// access item in collection
			String item = it.next();
			// modify item in collection
			item = item.toUpperCase() + ", ";
			it.set(item);  // only in ListIterator
		}
		System.out.println(this.getClass().getSimpleName()
				+ ": useLinkedList: Showing "
				+ col.size() + " items:"
				);
		for (String item : col) {
			System.out.print(item);
		}
		System.out.println();
	}

	public static void demoException(Exception e) {
		System.out.printf("%s\t", e.getStackTrace());
		System.out.printf("%s\t", e.getStackTrace());
		System.out.printf("%s\t", e.getStackTrace());
		System.out.printf("%s\n", e.getStackTrace());
	}

	public static void demoDialogBox() {

		String sNum1 = JOptionPane.showInputDialog("Enter 1st number: ");
//		if (sNum1 != JOptionPane.CANCEL_OPTION 
//				&& sNum1 != JOptionPane.CLOSED_OPTION
//				&& sNum1 != JOptionPane.UNINITIALIZED_VALUE) {
//		}
		String sNum2 = JOptionPane.showInputDialog("Enter 2nd number: ");
		String sOp = JOptionPane.showInputDialog("Enter Operation code:\n"
				+ "1: Add\n"
				+ "2: Subtract\n"
				+ "3: Multiply\n"
				+ "4: Divide\n"
				);
		int result = 0;
		switch (Integer.parseInt(sOp)) {
		case 1:
			result = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);
			break;
		case 2:
			result = Integer.parseInt(sNum1) - Integer.parseInt(sNum2);
			break;
		case 3:
			result = Integer.parseInt(sNum1) * Integer.parseInt(sNum2);
			break;
		case 4:
			result = Integer.parseInt(sNum1) / Integer.parseInt(sNum2);
			break;
		default:
				break;
		}
		
		JOptionPane.showMessageDialog(null, "Result is: " + result);
		
		return;
	}
	/**
	 * CreateAndShowGui:
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event-dispatching thread.
	 */
	public static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("TopLevelDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create the menu bar.  Make it have a green background.
		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(154, 165, 127));
		greenMenuBar.setPreferredSize(new Dimension(200, 20));

		//Create a yellow label to put in the content pane.
		JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(new Color(248, 213, 131));
		yellowLabel.setPreferredSize(new Dimension(200, 180));

		JTextField myTextField = new JTextField();
		myTextField.setText("Antonio");

		//Set the menu bar and add the label to the content pane.
		frame.setJMenuBar(greenMenuBar);
		frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
		// add the textField
		frame.getContentPane().add(myTextField, BorderLayout.CENTER);

		//Display the window.
		frame.pack();
		frame.setVisible(true);

		demoDialogBox();
		JOptionPane.showMessageDialog(null, "myTextField Contains: " + myTextField.getText());
		JOptionPane.showConfirmDialog(null, "Confirm Dialog");

	}

	/**
	 * DisplayContainer:
	 * Show the contents of the container
	 * 
	 * @param l - container to display
	 * @param label - custom banner for display
	 */
	private void displayContainerContents(List<String> l,
			String label,
			boolean landscape) {
		System.out.println(this.getClass().getSimpleName() + ": " + label + " Container contents: ");
		int i = 0;
		for (String n : l) {
			if (landscape) {
				System.out.print(Integer.toString(++i) + ": '" + n + "', ");
			} else {
				System.out.println(Integer.toString(++i) + ": '" + n + "'");
			} // end if
		} // end for
		System.out.println();
		
		System.out.println(l);	// Alternate output of list
//		System.out.println(l.toString());
	}

	/**
	 * intToAlgorithmSelector:
	 * convert integer selector to an algorithmn selector.
	 * 
	 * @param sel - integer selector
	 * @return - algorithm selector
	 */
	Algorithm intToAlgorithmSelector(int sel) {
		Algorithm algorithmSelector = Algorithm.ALG_NONE;

		if (sel == Algorithm.ALG_SORT.ordinal()) {
			algorithmSelector = Algorithm.ALG_SORT;
		} else if (sel == Algorithm.ALG_COMPARE.ordinal()) {
			algorithmSelector = Algorithm.ALG_COMPARE;
		} else if (sel == Algorithm.ALG_SIZE.ordinal()) {
			algorithmSelector = Algorithm.ALG_SIZE;
		} else if (sel == Algorithm.ALG_BINARY_SEARCH.ordinal()) {
			algorithmSelector = Algorithm.ALG_BINARY_SEARCH;
		} else if (sel == 0 || true) {
			algorithmSelector = Algorithm.ALG_NONE;
		}		

		return algorithmSelector;
	}

	/**
	 * intToContainerSelector:
	 * convert integer to a container selector.
	 * 
	 * @param sel - integer selector
	 * @return - returns a container class selector
	 */
	Container intToContainerSelector(int sel) {
		Container containerSelector = Container.CON_ARRAYLIST;

		if (sel == Container.CON_ARRAYLIST.ordinal()) {
			containerSelector = Container.CON_ARRAYLIST;
		} else if (sel == Container.CON_VECTOR.ordinal()) {
			containerSelector = Container.CON_VECTOR;
		} else if (sel == Container.CON_LINKEDLIST.ordinal()) {
			containerSelector = Container.CON_LINKEDLIST;
		} else if (sel == Container.CON_CUSTOM.ordinal()) {
			containerSelector = Container.CON_CUSTOM;
		} else if (sel == 0 || true) {
			containerSelector = Container.CON_ARRAYLIST;
		}
		
		return containerSelector;
	}

	/**
	 * getIntegerInput
	 * retrieve an integer command from standard input.
	 * 
	 * @return - integer input
	 */
	public int getIntegerInput() {
		Scanner in = new Scanner(System.in);
		int inputNum = 0;

		try {
			System.out.println("Enter command number: ");
			inputNum = in.nextInt();
		} catch (Exception e) {
			// InputMismatchException
			e.printStackTrace();
			System.err.println("Integer Input ERROR: "
					+ "[" + e.getCause() + "]" 
					+ "'" + e.getMessage() + "'");
		} finally {
			System.out.println("Integer Input Scanner Done.");
		}

		return inputNum;
	}

	/**
	 * getStringInput:
	 * retrieve a string from standard input.
	 * 
	 * @return string input.
	 */
	public String getStringInput(String prompt) {
		int limit = 1;
		String str = "";
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader input = new BufferedReader(in);
			System.out.println(prompt);
			int i = 0;
			while ((str = input.readLine()) != null) {
				System.out.println(str);
				if (++i >= limit) {
					break; // get out of loop
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("'" + e.getMessage() + "'" + " [" + e.getCause() + "]");
		} finally {
			System.out.println("Finally...");
		}

		System.out.println("Done!");

		return str;
	}

	/**
	 * makeArrayList
	 * Use an ArrayList Container to hold multiple String items.
	 * 
	 * @return - populated ArrayList container.
	 */
	public List<String> makeArrayList() {
		System.out.println(this.getClass().getSimpleName()
				+ ": " + "using ArrayList container");

		// Use List interface to Declare a versatile container variable:
		// Instantiate a container object suitable for application
		// MUST Specify BOTH Container type: List
		// AND container contents type <item type> : <String>
		List<String> names; // Declare container variable holding Strings

		// instantiate container object to hold Strings
		names = new ArrayList<String>(); // instantiate object for List variable

		// add String items to ArrayList container
		
		names = Arrays.asList(nameList);
		// eliminates the need for the following loop
//		for (int i = 0; i < nameList.length; ++i) {
//			names.add(nameList[i]);
//		}

		return names;
	}

	/**
	 * makeVector
	 * Use a Vector Container to hold multiple String items.
	 * @return - populated Vector container
	 */
	public List<String> makeVector() {
		System.out.println(this.getClass().getSimpleName()
				+ ": " + "using Vector container");
		
		// Use List interface to Declare a versatile container variable:
		// Instantiate a container object suitable for application
		// MUST Specify BOTH Container type: List
		// AND container contents type <item type> : <String>
		List<String> names; // Declare container variable holding Strings

		// instantiate container object to hold Strings
		names = new Vector<String>(); // instantiate object for List variable

		// add String items to container using common List API
		names = Arrays.asList(nameList);

		return names;
	}

	/**
	 * makeLinkedList
	 * Use an LinkedList Container to hold multiple String items.
	 * @return
	 */
	public List<String> makeLinkedList() {
		System.out.println(this.getClass().getSimpleName()
				+ ": " + "using LinkedList container");
		
		// Use List interface to Declare a versatile container variable:
		// Instantiate a container object suitable for application
		// MUST Specify BOTH Container type: List
		// AND container contents type <item type> : <String>
		List<String> names; // Declare container variable holding Strings

		// instantiate container object to hold Strings
		names = new LinkedList<String>(); // instantiate object for List
											// variable

		// add String items to container using List API
		names = Arrays.asList(nameList);

		return names;
	}

	public List<String> makeCustomArrayList(List<String> names) {
		System.out.println(this.getClass().getSimpleName()
				+ ": " + "using custom ArrayList container");

		// add strings container from standard input
		String inputStr;
		char cmd;
		do {
			inputStr = getStringInput("Type any name (or quit): ");

			// check first character for quit
			cmd = inputStr.charAt(0);
			switch (cmd) {

			case 'Q':
			case 'q':
				// Quit command: done with input
				break;
			default:
				// Not a commend: add string to container
				names.add(inputStr);
				break;
			}

		} while (cmd != 'Q' && cmd != 'q');

		return names;
	}

	/**
	 * makeContainer
	 * make a populated container of the selected class.
	 * 
	 * @param selector - container class selector
	 * 
	 * @return populate container of the selected class.
	 */
	public List<String> makeContainer(Container selector) {
		List<String> names = null;
		
		switch (selector) {
		case CON_ARRAYLIST:
			names = makeArrayList();
			break;
		case CON_VECTOR:
			names = makeVector();
			break;
		case CON_LINKEDLIST:
			names = makeLinkedList();
			break;
		case CON_CUSTOM:
			List<String> l = new ArrayList<String>();
			names = makeCustomArrayList(l);
			break;
		default:
			names = makeArrayList();
			break;
		}
		
		return names;
	}
	
	/**
	 * processContainer
	 * process the supplied container using the selected Collections algorithm.
	 * 
	 * @param c - supplied target container for transform
	 * @param selector - Collections algorithm selector
	 * @return -  transformed container or null if algorithm error.
	 */
	public List<String> processContainer(List<String> c, Algorithm selector) {
		List<String> names = c;
		
		// sort the list
		try {
			switch (selector) {
			case ALG_SORT:
				System.out.println("Sort strings lexagraphically.");
				Collections.sort(names);
				break;
			case ALG_BINARY_SEARCH:
				String keyString = "jessica";
				keyString = getStringInput("Type a search key (i.e. name): ");

				System.out.println("Binary search for '"
						+ keyString + "' on sorted container.");
				// REQIREMENT: list must be sorted
				Collections.sort(names);
				System.out.println("BinarySearch Found: " 
				+ names.get((Collections.binarySearch(names, keyString))));
				break;
			case ALG_COMPARE:
				System.out.println("Sort strings lexagraphically according to second char in string");
				Collections.sort(names, new Comparator<String>() {
					private static final int IX = 1;

					public int compare(String o1, String o2) {
						return o2.charAt(IX) - o1.charAt(IX);
					}
				});
				break;
			case ALG_SIZE:
				System.out.println("Sort strings according to string length.");

				Collections.sort(names, new Comparator<String>() {
					public int compare(String o1, String o2) {
						return o2.length() - o1.length();
					}
				});
				break;
			case ALG_NONE:
			default:
				System.out.println("No Algorithm.");
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Sort ERROR: " + "[" + e.getCause() + "]" + "'" + e.getMessage() + "'");
			// we're giving up, nothing transformed 
			names = null;
		} finally {
			System.out.println("All Sorted!");
		}
		
		// returned transformed container
		return names;
	}
	
	/**
	 * demo1
	 *  show use of different types of container classes
	 */
	public void demo1() {
		System.out.println(this.getClass().getSimpleName() 
				+ ": " + "demo1:");
		
		// create an ArrayList container holding strings
		System.out.print("Container Menu:\n"
				+ Container.CON_ARRAYLIST.ordinal() + ":" + Container.CON_ARRAYLIST.name() + "\n"
				+ Container.CON_VECTOR.ordinal() + ":" + Container.CON_VECTOR.name() + "\n"
				+ Container.CON_LINKEDLIST.ordinal() + ":" + Container.CON_LINKEDLIST.name() + "\n"
				+ Container.CON_CUSTOM.ordinal() + ":" + Container.CON_CUSTOM.name() + "\n"
				+ "Enter number? "
				);
		displayContainerContents(makeArrayList(), 
				"ArrayList of Strings",
				true);

		// create an Vector container holding strings
		displayContainerContents(makeVector(), 
				"Vector of Strings",
				true);

		// create an Vector container holding strings
		displayContainerContents(makeLinkedList(), 
				"LinkedList of Strings",
				true);
	}

	/**
	 * demo2
	 * process elements in a collection using Algorithms
	 */
	public void demo2() {
		final String METHOD_NAME = "demo2;";
		System.out.println(this.getClass().getSimpleName() 
				+ ": " + METHOD_NAME +":");

		List<String> coll = new ArrayList<String>();
		
		// populate collection
		coll = makeArrayList();
		
		// display original contents
		displayContainerContents(coll, 
				"Original Contents of collection",
				true);
		
		try {
			// lexigraphically sort the collection
			Collections.sort(coll);
			displayContainerContents(coll, "Sorted Collection", true); 
			// display a subset (2-5) of the sorted collection
			displayContainerContents(coll.subList(2, 5), "ONLY elements 3-6 of Sorted Collection", true); 
			// reverse the collection
			Collections.reverse(coll);
			displayContainerContents(coll, "Reversed Collection", true); 
			// reverse the collection
			Collections.rotate(coll, 1);
			displayContainerContents(coll, "Rotated by 1 Collection", true); 
			// search for one element
			Collections.binarySearch(coll, "Lynda");
			// return the smallest element
			System.out.println("Minimum out of all " + coll.size() + " elements: '" 
					+ Collections.min(coll) +"'");
			// return the greatest element
			System.out.println("Maximum out of all " + coll.size() + " elements: '" 
					+ Collections.max(coll) +"'");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(this.getClass().getSimpleName()
					+ ": ERROR Algorithm"
					+ "'" + e.getMessage() +"'"
					+ "[" + e.getCause() + "]"
					);
		}
	}
	
	/**
	 * demo3
	 * Select and fill a container and process it with a selected Collections algorithm
	 */
	public void demo3() {
		final String METHOD_NAME = "demo3;";
		System.out.println(this.getClass().getSimpleName() 
				+ ": " + METHOD_NAME +":");

		
//		JFrame frame = new JFrame();
//		frame.setVisible(true);
//		Label myLabel = new Label();
//		myLabel.setText("Important");
//		myLabel.setVisible(true);
//		frame.getContentPane().add(myLabel, BorderLayout.CENTER);
//		JOptionPane.showMessageDialog(frame, "This is a message in a dialog box.");

		boolean sortError = false;
		int select = 0;
		List<String> names; // general container variable

		// select and create a loaded container type
		String s = null;
		s = JOptionPane.showInputDialog("Collection select menu:\n"
				+ Container.CON_ARRAYLIST.ordinal() + ":" + Container.CON_ARRAYLIST.name() + "\n"
				+ Container.CON_VECTOR.ordinal() + ":" + Container.CON_VECTOR.name() + "\n"
				+ Container.CON_LINKEDLIST.ordinal() + ":" + Container.CON_LINKEDLIST.name() + "\n"
				+ Container.CON_CUSTOM.ordinal() + ":" + Container.CON_CUSTOM.name() + "\n"
				+ "Select Collection class by entering number: "
				);
		
		System.out.print("Collection select menu:\n"
				+ Container.CON_ARRAYLIST.ordinal() + ":" + Container.CON_ARRAYLIST.name() + "\n"
				+ Container.CON_VECTOR.ordinal() + ":" + Container.CON_VECTOR.name() + "\n"
				+ Container.CON_LINKEDLIST.ordinal() + ":" + Container.CON_LINKEDLIST.name() + "\n"
				+ Container.CON_CUSTOM.ordinal() + ":" + Container.CON_CUSTOM.name() + "\n"
				+ "Select collection class by entering number: "
				);
//		names = makeContainer(intToContainerSelector(getIntegerInput()));
		names = makeContainer(intToContainerSelector(Integer.parseInt(s)));

		// display container contents
		displayContainerContents(names, "Original", true);

		
		// process the container by algorithm
		s = JOptionPane.showInputDialog("Algorithm select menu:\n"
				+ Algorithm.ALG_SORT.ordinal() + ":" + Algorithm.ALG_SORT.name() + "\n"
				+ Algorithm.ALG_COMPARE.ordinal() + ":" + Algorithm.ALG_COMPARE.name() + "\n"
				+ Algorithm.ALG_SIZE.ordinal() + ":" + Algorithm.ALG_SIZE.name() + "\n"
				+ Algorithm.ALG_BINARY_SEARCH.ordinal() + ":" + Algorithm.ALG_BINARY_SEARCH.name() + "\n"
				+ Algorithm.ALG_NONE.ordinal() + ":" + Algorithm.ALG_NONE.name() + "\n"
				+ "Select algorithm by entering number: "
				);
		
		System.out.print("Algorithm select menu:\n"
				+ Algorithm.ALG_SORT.ordinal() + ":" + Algorithm.ALG_SORT.name() + "\n"
				+ Algorithm.ALG_COMPARE.ordinal() + ":" + Algorithm.ALG_COMPARE.name() + "\n"
				+ Algorithm.ALG_SIZE.ordinal() + ":" + Algorithm.ALG_SIZE.name() + "\n"
				+ Algorithm.ALG_BINARY_SEARCH.ordinal() + ":" + Algorithm.ALG_BINARY_SEARCH.name() + "\n"
				+ Algorithm.ALG_NONE.ordinal() + ":" + Algorithm.ALG_NONE.name() + "\n"
				+ "Select algorithm by entering number: "
				);

//		names = processContainer(names,
//				intToAlgorithmSelector(getIntegerInput()));
		names = processContainer(names,
				intToAlgorithmSelector(Integer.parseInt(s)));
		
		if (names != null) {
			// display list contents
			displayContainerContents(names, "Sorted", true);
			// Alternate output of list
			System.out.println(names);
			System.out.println(names.toString());
		}
		return;
	}

	/**
	 * demo4
	 * Use the supplied container, add to it and process with an algorithm.
	 * @param names
	 */
	public void demo4(List<String> names) {
		final String METHOD_NAME = "demo4;";
		System.out.println(this.getClass().getSimpleName() 
				+ ": " + METHOD_NAME +":");
		// Algorithm algorithm = Algorithm.ALG_SORT;
		// Algorithm algorithm = Algorithm.ALG_BINARY_SEARCH;
		// Algorithm algorithm = Algorithm.ALG_SIZE;
//		Algorithm algorithm = Algorithm.ALG_COMPARE;
		Algorithm algorithm = Algorithm.ALG_ALPHA_IGNORE_CASE;
		boolean sortError = false;

		// populate the list: containers can grow in size
		names.add("Mario");
		// names.add(null); // this will cause an exception

		// add to list from standard input
		String cmd;
		char c;
		do {
			cmd = getStringInput("Type any name (or 'q' to quit): ");

			c = cmd.charAt(0);
			switch (c) {

			case 'Q':
			case 'q':
				break;
			default:
				names.add(cmd);
				break;
			}

		} while (c != 'Q' && c != 'q');

		// display list contents
		displayContainerContents(names, "Original", true);

		try {
			// sort the list
			switch (algorithm) {
			case ALG_SORT:
				Collections.sort(names);
				break;
			case ALG_BINARY_SEARCH:
				// REQIREMENT: list must be sorted
				Collections.sort(names);
				System.out.println("BinarySearch Found: " + names.get((Collections.binarySearch(names, "jessica"))));
				break;
			case ALG_COMPARE:
				// Sort anagram groups according to size
				Collections.sort(names, new Comparator<String>() {
					private static final int IX = 1;

					public int compare(String o1, String o2) {
						return o2.charAt(IX) - o1.charAt(IX);
					}
				});
				break;
			case ALG_ALPHA_IGNORE_CASE:
				// Sort anagram groups according to size
				Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
				break;
			case ALG_SIZE:
				// Sort anagram groups according to size
				Collections.sort(names, new Comparator<String>() {
					public int compare(String o1, String o2) {
						return o2.length() - o1.length();
					}
				});
				break;
			case ALG_NONE:
			default:
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Sort ERROR: " + "[" + e.getCause() + "]" + "'" + e.getMessage() + "'");
			sortError = true;
		} finally {
			System.out.println("All Sorted!");
		}

		if (!sortError) {
			// display list contents
			displayContainerContents(names, "Sorted", true);
		}
		return;
	}
	
	public void demo5() {
		int [] myInts = {1,2,3};
		
		System.out.println(myInts.length + " elements in container.");
		for (int n : myInts) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		return;
	}
	
	public void demo6() {
//		List<String> names = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		names.add("Al");
		names.add("Jen");
		names.add("Dave");
		names.add("Dan");
		names.add("Sam");
		names.add("Zach");
		
		System.out.println(names.size() + " elements in container.");
		for (String n : names) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
	}
	
	public void demoMap() {
		System.out.println(DemoContainer.class.getSimpleName() + ".demoMap()");
		{
			// HashMap<Key, Value>
			Map<Integer, String>m = new HashMap<>();
			m.put(1,"one");
			m.put(3,"three");
			m.put(5,"five");
			m.put(null, "nullKey");	// hashMap accepts null key
			m.put(7, null);		// HashMap accepts null value
			System.out.println("Display map keys: ");
			for (Integer key : m.keySet()) {
				System.out.print(key + ", ");
			}
			System.out.println(m.size() + " Elements in map: " + m);
			System.out.println("Display map values: ");
			for (String value : m.values()) {
				System.out.print(value + ", ");
			}
			System.out.println(m.size() + " Elements in map: " + m);
			// random access element by key
			System.out.println("5 is the integer index for the string " + m.get(5));
		}
		{
		Map<String, String> m = new Hashtable<String,String>();		
		m.put("NY","New York");
		m.put("MA","Massachusettes");
		m.put("NH", "New Hampshire");
//		m.put(null, "nullKey");	// NullPointerException: hashtable DOES NOT accept null key
//		m.put("nullKey", null);		// NullPointerException: hashtable DOES NOT accept null value
		System.out.println("Display map keys: ");
		for (String key : m.keySet()) {
			System.out.print(key + ", ");
		}
		System.out.println("\n " + m.size() + " Elements in map: " + m);
		System.out.println("Display map values: ");
		for (String value : m.values()) {
			System.out.print(value + ", ");
		}
		System.out.println("\n " + m.size() + " Elements in map: " + m);
		// random access element by key
		System.out.println("NH is the abreviation for the state of " + m.get("NH"));
		}
		{
		Map<Integer, String> m = new TreeMap<Integer,String>();		
		m.put(19,"Dan");
		m.put(21,"James");
		m.put(3, "Baby Sue");
//		m.put(null, "nullKey");	// NullPointerException: TreeMap DOES NOT accept null key
//		m.put(7, null);		// NullPointerException: TreeMap DOES NOT accept null value
		System.out.println("Display map keys (Age): ");
		for (Integer key : m.keySet()) {
			System.out.print(key + ", ");
		}
		System.out.println("Display map values (Names): ");
		for (String value : m.values()) {
			System.out.print(value + ", ");
		}
		System.out.println("\n " + m.size() + " Elements in map: " + m);
		// random access element by key
		System.out.println("3 is the correct age for " + m.get(3));
		}
	}
	
	public void demoQueue() {
//		Queue<String> q = new ArrayDeque<>();	// FIFO
		Queue<String> q = new PriorityQueue<>();	// natural order
		q.add("Jim");
		q.add("Jon");
		q.add("Jan");
		
		System.out.println(q.size() + " elements in container");
		for (String name: q) {
			System.out.print(name +", ");
		}
		System.out.println();
//		Collections.sort(q);		// can't sort queue
		List<String> l =  new LinkedList<>(q);
//		List<String> l =  new ArrayList<>(q);
		
		System.out.println(q.remove() + ", ");
		System.out.println(q.remove() + ", ");
		System.out.println(q.remove() + ", ");

		Collections.sort(l);
		System.out.println(l.size() + " elements in sorted container");
		for (String name: l) {
			System.out.print(name +", ");
		}
		System.out.println();
		int i = 0;
	}

	public void sortInnerPerson() {
		System.out.println(DemoContainer.class.getSimpleName() + ".sortInnerPerson()");
		List<InnerPerson> l = new ArrayList<>();
		l.add(new InnerPerson("john", "adams", 52));
		l.add(new InnerPerson("ben", "franklin", 62));
		l.add(new InnerPerson("george", "washington", 69));
		l.stream().forEach(n -> System.out.print(n + ", "));
		System.out.println(l.size() + " elements in list");
		Collections.sort(l, Comparator.comparing(InnerPerson::getAge));
		l.stream().forEach(n -> System.out.print(n + ", "));
		System.out.println(DemoContainer.class.getName() + " sortInnerPerson() - " + l.size() + " elements in list");
	}
	
	public void basicMapExample() {
		System.out.println(DemoContainer.class.getSimpleName() + ".basicMapExample()");
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Dan");		// associating NEUID (int) and Students (String) in map
		m.put(5, "Albert");
		m.put(21, "Hugo");
		int key = 5;			// search for this key
		System.out.println("Use the map and NUID (map key) " + key 
				+ ", I retrieve the NEU student " + m.get(5) );
	}
	public static void demo() {
		System.out.println("\n\n" + DemoContainer.class.getSimpleName() + ".demo()");
		DemoContainer obj = new DemoContainer();
//		obj.demo1();
//		obj.demo2();
//		obj.demo3();	// select container and algorithm by GUI menu	
//		List<String> names = new ArrayList<String>();
//		names.add("Zach");
//		names.add("Sam");
//		names.add("Dave");
//		names.add("Al");
//		names.add("Dan");
//		names.add("Jen");
//		obj.demo4(names);	// INPUT: process container of names with algorithm
//		obj.demo5();	// using array of ints
//		obj.demo6();	// using sequence container of names

		obj.demoMap();
//		obj.sortNameList();
//		obj.sortSimpleNumberList();
//		obj.sortNumberList();
//		obj.sortStringList();
//		obj.demoQueue();
//		obj.sortStudent();
//		obj.sortBoxedIntList();
//		obj.basicMapExample();
//		obj.useIterator();
//		obj.sortInnerPerson();
	}
}
