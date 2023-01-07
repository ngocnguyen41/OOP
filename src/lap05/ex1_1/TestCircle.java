package lap05.ex1_1;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.printf("The circle has radius of %.2f and area of %.2f ", circle1.getRadius(), circle1.getArea());

		Circle circle2 = new Circle(3.0);
		System.out.println(circle2);
		System.out.printf("The circle has radius of %.2f and area of %.2f ", circle2.getRadius(), circle2.getArea());
		System.out.println();

		Circle circle3 = new Circle();
		circle3.setRadius(5.5);
		System.out.println("radius is: " + circle3.getRadius());
		circle3.setColor("green");
		System.out.println("color is: " + circle3.getColor());

		Circle circle4 = new Circle(5.5);
		System.out.println(circle4.toString());

		Circle circle5 = new Circle(6.6);
		System.out.println(circle5.toString());
		System.out.println(circle5);
		System.out.println("Operator '+' invokes toString() too: " + circle5);
	}
}
