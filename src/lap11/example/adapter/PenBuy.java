package lap11.example.adapter;

public class PenBuy implements PenBuyer {
	PenBuyer penBuyer;

	@Override
	public void buy(String penType, String penColor) {
		if (penType.equalsIgnoreCase("pencil") || penType.equalsIgnoreCase("ballpointpen")) {
			penBuyer = new PenAdapter(penType);
			penBuyer.buy(penType, penColor);
		}

		else {
			System.out.println("Not " + penType + " " + penColor);
		}
	}
}
