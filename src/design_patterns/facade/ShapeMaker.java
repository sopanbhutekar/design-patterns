package design_patterns.facade;
//Facade Class
public class ShapeMaker {
	private Circle circle;
	private Square square;
	private Rectangle rectangle;
	
	ShapeMaker(){
		circle=new Circle();
		square=new Square();
		rectangle= new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}	

}
