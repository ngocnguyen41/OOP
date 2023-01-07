package lap07.ex1_5;

public class TestResizableCircle {
	public static void main(String[] args) {
		ResizableCircle resizableCircle1 = new ResizableCircle(3.5);
		resizableCircle1.resize(20);

		System.out.println("resize: " + resizableCircle1.resize(20));
		System.out.println("Area: " + resizableCircle1.getArea());
		System.out.println("Perimeter: " + resizableCircle1.getPerimeter());
	}
}
