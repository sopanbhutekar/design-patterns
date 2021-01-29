package design_patterns.builder;

public abstract class ColdDrink implements Item{
	
	@Override
	public Packing pack() {
		return new Bottle();
	}
}
