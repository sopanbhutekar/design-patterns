package design_patterns.abstract_factory;

import design_patterns.common.Shape;

public interface AbstractFactory {
	public Shape getShape(String shapeType);	
}
