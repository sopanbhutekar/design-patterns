package design_patterns.builder;

public class BuilderPatternExample {

	public static void main(String[] args) {
		// Builder pattern builds a complex object using simple objects and using a step
		// by step approach. This type of design pattern comes under creational pattern
		// as this pattern provides one of the best ways to create an object.
		Meal vegMeal= MealBuilder.prepareVegMeal();
		vegMeal.printItems();
		System.out.println("Cost: "+vegMeal.cost());

		Meal nonVegMeal= MealBuilder.prepareNonVegMeal();
		vegMeal.printItems();
		System.out.println("Cost: "+nonVegMeal.cost());
	}

}
