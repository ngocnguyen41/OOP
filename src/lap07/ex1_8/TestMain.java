package lap07.ex1_8;

public class TestMain {
		public static void main(String[] args) {
			Movable m1 = new MovablePoint(5, 6, 10, 15);
			System.out.println(m1);
			m1.moveLeft();
			System.out.println(m1);

			Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
			System.out.println(m2);
			m2.moveRight();
			System.out.println(m2);

			MovableRectangle movableRectangle = new MovableRectangle(1, 2, 3, 4, 5, 6);
			System.out.println(movableRectangle);
			movableRectangle.moveUp();
			movableRectangle.moveLeft();
			System.out.println(movableRectangle);
			movableRectangle.moveDown();
			movableRectangle.moveRight();
			System.out.println(movableRectangle);
		}
}
