package lap07.ex1_2;

public class TestMain {
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.4);
		System.out.println("Circle of area: " + circle1.getArea());
		System.out.println("Circle of perimeter: " + circle1.getPerimeter());

		Rectangle rectangle1 = new Rectangle(2.3, 4.5);
		System.out.println("Rectangle of area: " + rectangle1.getArea());
		System.out.println("Rectangle of perimeter: " + rectangle1.getPerimeter());
	}
}
