package methodrefdemo;

public class ShapeDrawingDemo {
	
	public static void drawingRectangle(){
		System.out.println("Drawing Rectangle");
	}
	

	public static void main(String[] args) {
		Shape rectangle = ShapeDrawingDemo::drawingRectangle;
		rectangle.draw();
	}
}
