package lap14.visitor.exercises.computer;

public interface ComputerPartVisitor {
	void visit(Computer computer);

	void visit(Keyboard keyboard);

	void visit(Mouse mouse);

	void visit(Monitor monitor);
}


