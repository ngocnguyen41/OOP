package lap11.example.adapter;

public class Demo {
	public static void main(String[] args) {
		PenBuy buyer = new PenBuy();

		buyer.buy("ballpointpen", "black");
		buyer.buy("pencil", "red");
		buyer.buy("pen", "green");
	}
}
