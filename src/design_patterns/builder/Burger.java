package design_patterns.builder;

public abstract class Burger implements Item{
	@Override
	public Packing pack() {
		return new Wrapper();
	}
}
