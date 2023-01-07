package lap07.ex1_4;

public class TestMain {
	public static void main(String[] args) {
		MovableCircle movableCircle1 = new MovableCircle(1, 2, 3,4, 5);
		System.out.println("Initial point: " + movableCircle1);

		movableCircle1.moveUp();
		System.out.println("Point move up " + movableCircle1);

		movableCircle1.moveLeft();
		System.out.println("Point move left " + movableCircle1);

		movableCircle1.moveDown();
		System.out.println("Point move down " + movableCircle1);

		movableCircle1.moveRight();
		System.out.println("Point move right " + movableCircle1);
	}
}
