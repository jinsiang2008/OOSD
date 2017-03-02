
public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("Circle")){
			//read radius from conf file
			//get positon
			//determine the radius
			
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("Square")){
			return new Square();
		} else if (shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		
		return null;
	}
}
