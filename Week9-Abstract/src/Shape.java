public abstract class Shape {
	String color;
	
	abstract double getArea();
	abstract double getPerimeter();
	
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
