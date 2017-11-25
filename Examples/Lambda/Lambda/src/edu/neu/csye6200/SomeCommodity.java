package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class SomeCommodity extends AbstractCommodity {
	private String about;
	
	public SomeCommodity() {
		super();
	}
	
	public SomeCommodity(String name, double price) {
		super(name, price, Color.BLACK, 1.0);
		about = "This is something else.";
	}
	
	public SomeCommodity(String name, double price, Color color, Double lbs, String describe) {
		super(name, price, color, lbs);
		setAbout(describe);
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() 
				+ "\n - DESCRIPTION: "
				+ getAbout();
	}
	void description () {
		System.out.println(toString());
	}
	
	static void demo() {
//		Thing obj = new Thing();
		
		List<SomeCommodity> l = new ArrayList<>();
		l.add(new SomeCommodity("iPhone 7", 399.00, Color.WHITE, 0.15, "Apple smartphone with 256GB flash"));
		l.add(new SomeCommodity("iPhone 7", 399.00, Color.GOLD, 0.15, "Apple smartphone with 256GB flash"));
		l.add(new SomeCommodity("iPad mini", 699.00, Color.GOLD, 0.35, "Apple tablet with 128GB flash"));
		l.add(new SomeCommodity("macBook", 1599.00, Color.SILVER, 1.65, "Apple laptop 512GB flash"));

		// use a Java 8 lambda and new loop through collection: col.foreach(action);
		System.out.println("demo: Java 8: loop through collection using 'col.foreach(action)' WITH lambda implementation of action");
//		l.forEach(t -> t.description());
		
		// show only a filtered subset of entire collection
//		System.out.println("demo: Java 8: filter collection using 'col.stream().filter(filterGOLD)' WITH lambda implementation of filterGOLD");
//		l.stream().filter(AbstractCommodity.goldColor).forEach( eachItem -> eachItem.description());
//		l.stream().filter(item -> { return AbstractCommodity.Color.GOLD.equals(item.getColor()); }).forEach( eachItem -> eachItem.description());
		
		System.out.println("demo: Java 8: filter collection using 'col.stream().filter(filterGOLD && filterCHEAP)' WITH lambda implementations of filterGOLD filterCHEAP");
		l.stream().filter(item -> { return (item.getPrice() <= 400.0); }).forEach( eachItem -> eachItem.description());
//		l.stream().filter(item -> { return AbstractCommodity.Color.GOLD.equals(item.getColor()) && (item.getPrice() <= 400.0); }).forEach( eachItem -> eachItem.description());
//		bad l.stream().filter(item -> { return AbstractCommodity.goldColor && (item.getPrice() <= 400.0); }).forEach( eachItem -> eachItem.description());
	}
}
