package design_patterns.abstract_factory;

public class FactoryProvider {
	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundedShapeFactory();
		}else {
			return new ShapeFactory();
		}
	}
}
