package lap05.ex1_3;

public class Rectangle {
	private float length;
	private float width;

	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[length = " + length + ", width = " + width + ']';
	}
}
