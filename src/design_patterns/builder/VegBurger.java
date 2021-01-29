package design_patterns.builder;

public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float cost() {
		return 35.0f;
	}

}
