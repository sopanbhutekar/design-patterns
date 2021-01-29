package design_patterns.builder;

public class BuilderPatternExample {

	public static void main(String[] args) {
		Meal vegMeal= MealBuilder.prepareVegMeal();
		vegMeal.printItems();
		System.out.println("Cost: "+vegMeal.cost());

		Meal nonVegMeal= MealBuilder.prepareNonVegMeal();
		vegMeal.printItems();
		System.out.println("Cost: "+nonVegMeal.cost());
	}

}
