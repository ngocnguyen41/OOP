package lap07.ex1_5;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public String toString() {
		return "ResizableCircle[" + super.toString() + ']';
	}

	@Override
	public double resize(int percent) {
		return radius *= percent / 100.0;
	}
}
