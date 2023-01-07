package lap11.adapter;

public class RoundHole {
	private double radius;

	public RoundHole(double radius) {
		this.radius = radius;
	}

	private double getRadius() {
		return radius;
	}

	public boolean fils(RoundPeg peg) {
		return this.radius >= peg.getRadius();
	}
}
