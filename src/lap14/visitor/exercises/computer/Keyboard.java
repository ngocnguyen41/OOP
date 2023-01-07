package lap14.visitor.exercises.computer;

public class Keyboard implements ComputerPart {
	@Override
	public void accept(ComputerPartVisitor v) {
		v.visit(this);
	}
}


