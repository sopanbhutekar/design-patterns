package design_patterns.factory;

import design_patterns.common.*;

public class FactoryProvider {
	public static Shape getFactory(String shapeType) {
		if(null==shapeType) {
			return null;
		}else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}
