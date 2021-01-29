package design_patterns.builder;

public class MealBuilder {
	
	public static Meal prepareVegMeal() {
		Meal vegMeal= new Meal();
		vegMeal.addItem(new Pepsi());
		vegMeal.addItem(new VegBurger());
		return vegMeal;
	}
	
	public static Meal prepareNonVegMeal() {
		Meal nonVegMeal= new Meal();
		nonVegMeal.addItem(new Coke());
		nonVegMeal.addItem(new NonVegBurger());
		return nonVegMeal;
	}

}
