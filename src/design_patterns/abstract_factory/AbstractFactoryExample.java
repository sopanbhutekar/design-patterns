package design_patterns.abstract_factory;

public class AbstractFactoryExample {

	public static void main(String[] args) {

		// In Abstract Factory pattern an interface is responsible for creating a
		// factory of related objects without explicitly specifying their classes. Each
		// generated factory can give the objects as per the Factory pattern
		
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
