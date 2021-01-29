package design_patterns.builder;

public class Pepsi extends ColdDrink{

	@Override
	public String name() {
		return "Pepsi";
	}
	@Override
	public float cost() {
		return 15.0f;
	}
}
