package design_patterns.abstract_factory;

public class AbstractFactoryExample {

	public static void main(String[] args) {
		
		//RoundedShapeFactory
		AbstractFactory factory= FactoryProvider.getFactory(true);
		
		factory.getShape("Rectangle").draw();		
		factory.getShape("Square").draw();
		
		//ShapeFactory object
		factory=FactoryProvider.getFactory(false);
		
		factory.getShape("Rectangle").draw();
		factory.getShape("Square").draw();

	}

}
