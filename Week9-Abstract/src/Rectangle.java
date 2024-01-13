public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(String color, double width, double height) {
		super(color);
		
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return width * 2 + height * 2;
	}
}
