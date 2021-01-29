package design_patterns.builder;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}
	@Override
	public float cost() {
		return 12.0f;
	}
	
}
