package edu.neu.csye6200.LamdaStreams;

import java.util.ArrayList;
import java.util.List;

public class LambdaQuiz {
	private String name;
	private Double price;
	private Double weightOz;
	private Integer calories;
	private String description;
	
	

	public LambdaQuiz() {
		super();
	}

	public LambdaQuiz(String name, Double price, Double weightOz, Integer calories, String description) {
		super();
		this.name = name;
		this.price = price;
		this.weightOz = weightOz;
		this.calories = calories;
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeightOz() {
		return this.weightOz;
	}

	public void setWeightOz(Double weightOz) {
		this.weightOz = weightOz;
	}

	public Integer getCalories() {
		return this.calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void sortFood() {
		List<LambdaQuiz> list = new ArrayList<>();
		// add Food items : Name, Price, Weight, Calories, Description
		list.add(new LambdaQuiz("Apples", 2.49, 3.79, 10, "Healthy Gala Apple."));
		list.add(new LambdaQuiz("Oranges", 5.49, 4.39, 40, "Healthy Florida Orange."));
		list.add(new LambdaQuiz("Bananna", 1.49, 2.39, 80, "Healthy Chiquita bannana."));
		list.add(new LambdaQuiz("Big Mac", 2.89, 0.29, 480, "McDonald's Big Mac Burger."));
		list.add(new LambdaQuiz("Oreo", 1.89, 0.32, 190, "Oreo cookie."));
		
		 list
		 .stream()
		 .filter( a -> a.getDescription().startsWith("Healthy"))
		 .sorted( ( f1 , f2 ) -> f1. getWeightOz().compareTo(f2. getWeightOz())  )
		 .map( f -> { 
			 LambdaQuiz obj = new LambdaQuiz();
			 obj.setName(f.getName());
			 obj.setPrice(f.getPrice() + 10);
			 obj.setWeightOz(f.getWeightOz());
			 obj.setCalories(f.getCalories());
			 obj.setDescription(f.getDescription());
			 return obj;
			 })
		 .forEach(f -> System.out.printf("Food: $%.2f %s %.2foz %dcals Description: %s %n",f.getPrice(), f.getName()
				 , f.getWeightOz(), f.getCalories(), f.getDescription()));
	}

}

// Given the code fragment above, and the following three lines of desired
// console output:
//
// Food: $11.49 Bananna 2.39oz 80cals Description: Healthy Chiquita bannana.
// Food: $12.49 Apples 3.79oz 10cals Description: Healthy Gala Apple.
// Food: $15.49 Oranges 4.39oz 40cals Description: Healthy Florida Orange.
//
// Complete the entire implementation in one class called LambdaQuiz. Use
// streams as outlined (below) to produce the desired console output.
//
