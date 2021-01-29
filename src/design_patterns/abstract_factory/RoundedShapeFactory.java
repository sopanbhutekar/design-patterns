package design_patterns.abstract_factory;

import design_patterns.common.*;

public class RoundedShapeFactory implements AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		if(null==shapeType) {
			return null;
		}else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new RoundedRectangle();
		}else if(shapeType.equalsIgnoreCase("Square")) {
			return new RoundedSquare();
		}			
		return null;
	}
}
