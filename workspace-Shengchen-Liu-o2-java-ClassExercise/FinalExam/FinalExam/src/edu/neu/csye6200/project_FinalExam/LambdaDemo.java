package edu.neu.csye6200.project_FinalExam;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
	private String name;
	private Double price;
	private Double weightOz;
	private Integer calories;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeightOz() {
		return weightOz;
	}

	public void setWeightOz(Double weightOz) {
		this.weightOz = weightOz;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LambdaDemo() {
	}

	public LambdaDemo(String name, Double price, Double weightOz, Integer calories, String description) {
		super();
		this.name = name;
		this.price = price;
		this.weightOz = weightOz;
		this.calories = calories;
		this.description = description;
	}

	public static void sortFood() {
		List<LambdaDemo> foods = new ArrayList<>();
		// add Food items : Name, Price, Weight, Calories, Description
		foods.add(new LambdaDemo("Apples", 2.49, 3.79, 10, "Healthy Gala Apple."));
		foods.add(new LambdaDemo("Oranges", 5.49, 4.39, 40, "Healthy Florida Orange."));
		foods.add(new LambdaDemo("Bananna", 1.49, 2.39, 80, "Healthy Chiquita bannana."));
		foods.add(new LambdaDemo("Big Mac", 2.89, 0.29, 480, "McDonald's Big Mac Burger."));
		foods.add(new LambdaDemo("Oreo", 1.89, 0.32, 190, "Oreo cookie."));
		
		foods
		.stream()
		.filter(a -> a.getDescription().startsWith("Healthy"))
		.sorted((f1, f2 ) -> f1.getWeightOz().compareTo(f2.getWeightOz()))
		.map(f -> {
			LambdaDemo obj = new LambdaDemo();
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
