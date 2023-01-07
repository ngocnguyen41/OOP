package lap14.visitor.exercises.computer;

public class VisitorPatternDemo {
	public static void main(String[] args) {
		ComputerPart computerPart1 = new Keyboard();
		ComputerPart computerPart2 = new Monitor();
		ComputerPart computerPart3 = new Mouse();

		ComputerPartVisitor v = new ComputerPartDisplayVisitor();
		computerPart1.accept(v);
		System.out.println();
		computerPart2.accept(v);
		System.out.println();
		computerPart3.accept(v);
		System.out.println();
	}
}
