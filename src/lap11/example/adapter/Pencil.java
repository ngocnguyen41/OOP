package lap11.example.adapter;

public class Pencil implements Pen {
	@Override
	public void buyPencil(String penColor) {
		System.out.println("Buying color pencils: " + penColor);
	}

	@Override
	public void buyBallpointPen(String fileName) {

	}
}

