package design_patterns.factory;

import design_patterns.common.Shape;

public class FactoryDesignPatters {

	public static void main(String[] args) {
	
		// In Factory pattern, we create object without exposing the creation logic to
		// the client and refer to newly created object using a common interface.
		Shape s1= FactoryProvider.getFactory("Rectangle");
		s1.draw();
		
		Shape s2=FactoryProvider.getFactory("Circle");
		s2.draw();
		
		Shape s3=FactoryProvider.getFactory("Square");
		s3.draw();
	}

}
