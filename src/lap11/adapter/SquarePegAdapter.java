package lap11.adapter;

public class SquarePegAdapter extends RoundPeg{
	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		super(peg.getWidth());
		this.peg = peg;
	}

	public double getRadius() {
		return this.peg.getWidth() * Math.sqrt(2) / 2;
	}
}
