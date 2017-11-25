package edu.neu.csye6200.esper6_1_0;

public class Tick {
	String symbol;
	Double price;
	Long timestamp;
	
	public Tick(String symbol, double price, Long timestamp) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.timestamp = timestamp;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Price: " + this.price.toString() 
		+ " time: " + this.timestamp.toString();
	}
}
