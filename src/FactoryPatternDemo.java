
public class FactoryPatternDemo {
	private final ShapeFactory shapeFactory = new ShapeFactory();
	
	public void demo(String[] args){
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();	
	}
}
