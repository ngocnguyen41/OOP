package lap11.example.adapter;

public class BallpointPen implements Pen {
	@Override
	public void buyPencil(String penColor) {
		// do nothing
	}

	@Override
	public void buyBallpointPen(String penColor) {
		System.out.println("Buying color ballpint pens: " + penColor);
	}
}
