package design_patterns.builder;

public class NonVegBurger extends Burger{

	@Override
	public String name() {
		return "Non-Veg Burger";
	}

	@Override
	public float cost() {
		return 50.0f;
	}
}
