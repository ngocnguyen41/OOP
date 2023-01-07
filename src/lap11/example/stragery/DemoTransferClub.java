package lap11.example.stragery;

public class DemoTransferClub {

		public static void main(String[] args) {
			ShoppingClub cart = new ShoppingClub();
			
			Item item1 = new Item("MF",12);
			Item item2 = new Item("FW",72);
			
			cart.addItem(item1);
			cart.addItem(item2);

			cart.pay(new Trade("12tfjhscjs", 20));
			cart.pay(new Trade("15tfjhscjs", 60));

			cart.pay(new TranferCard("Alice", 18, "FW", "Girl"));
			cart.pay(new TranferCard("Bob", 21, "MF", "Boy"));
		}

	}

