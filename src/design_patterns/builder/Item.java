package design_patterns.builder;

public interface Item {
	public String name();
	public Packing pack();
	public float cost();	
}
