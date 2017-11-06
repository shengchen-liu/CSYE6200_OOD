package edu.neu.csye6200;

import java.util.function.Predicate;

public abstract class AbstractCommodity {
	private String m_name;
	private Double m_price;
	private Color m_color;
	private Double m_weightLbs;

	public enum Color {
		BLACK,
		GOLD,
		SILVER,
		WHITE
	}

	// provide filter predicates class data 
	public static Predicate<AbstractCommodity> whiteColor = p -> { return Color.WHITE.equals(p.getColor()); }; 
	public static Predicate<AbstractCommodity> goldColor = p -> { return Color.GOLD.equals(p.getColor()); }; 
	public static Predicate<AbstractCommodity> silverColor = p -> { return Color.SILVER.equals(p.getColor()); }; 
	public static Predicate<AbstractCommodity> blackColor = p -> { return Color.BLACK.equals(p.getColor()); }; 

	public AbstractCommodity() {
		super();
	}
	public AbstractCommodity(String name, Double price, Color color, Double weightLbs) {
		super();
		this.m_name = name;
		this.m_price = price;
		this.m_color = color;
		this.m_weightLbs = weightLbs;
	}
	public String getName() {
		return m_name;
	}
	public void setName(String name) {
		this.m_name = name;
	}
	public Double getPrice() {
		return m_price;
	}
	public void setPrice(Double price) {
		this.m_price = price;
	}
	public Color getColor() {
		return m_color;
	}
	public void setColor(Color color) {
		this.m_color = color;
	}
	public Double getWeightLbs() {
		return m_weightLbs;
	}
	public void setWeightLbs(Double weightLbs) {
		this.m_weightLbs = weightLbs;
	}
	
	@Override
	public String toString() {
		return "$ " + getPrice() + " " + getName()
		+ "\n - DETAILS:" 
		+ "\n   Color: " + getColor()
		+ "\n   Weight (Lbs): " + getWeightLbs()
		;
	}
	
	abstract void description();	// abstract method: subclass implementation requried
}
