public class ShapeRectangle {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle("Yellow", 3, 5);
		
		System.out.println("색상: " + rectangle.getColor());
		System.out.println("면적: " + rectangle.getArea());
		System.out.println("둘레: " + rectangle.getPerimeter());
	}
}
