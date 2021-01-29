package design_patterns.abstract_factory;

import design_patterns.common.Circle;
import design_patterns.common.Rectangle;
import design_patterns.common.Shape;
import design_patterns.common.Square;

public class ShapeFactory implements AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
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
