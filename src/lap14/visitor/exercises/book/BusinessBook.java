package lap14.visitor.exercises.book;

public class BusinessBook implements Book {
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String getPublisher() {
		return "Market Leader";
	}
}

