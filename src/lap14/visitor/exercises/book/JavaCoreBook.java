package lap14.visitor.exercises.book;

public class JavaCoreBook implements ProgrammingBook {
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	@Override
	public String getResource() {
		return "Youtube: Java tutorial";
	}

	public String getFavouriteBook() {
		return "300 bai code thieu nhi";
	}
}

