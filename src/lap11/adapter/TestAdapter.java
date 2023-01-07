package lap11.adapter;

public class TestAdapter {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);

		System.out.println(hole.fils(roundPeg));	// true

		SquarePeg smallSquarePeg = new SquarePeg(5);
		SquarePeg largeSquarePeg = new SquarePeg(10);

//		hole.fils(smallSquarePeg);

		SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
		SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

		System.out.println(hole.fils(smallSquarePegAdapter));	// true
		System.out.println(hole.fils(largeSquarePegAdapter));	// false
	}
}
