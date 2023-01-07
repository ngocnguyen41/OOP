package lap07.ex1_3;

public class TestMovablePoint {
	public static void main(String[] args) {
		MovablePoint movablePoint1 = new MovablePoint(1, 2, 3,4);
		System.out.println("Initial point: " + movablePoint1);

		movablePoint1.moveUp();
		System.out.println("Point move up " + movablePoint1);

		movablePoint1.moveLeft();
		System.out.println("Point move left " + movablePoint1);

		movablePoint1.moveDown();
		System.out.println("Point move down " + movablePoint1);

		movablePoint1.moveRight();
		System.out.println("Point move right " + movablePoint1);
	}
}
