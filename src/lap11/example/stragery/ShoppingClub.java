package lap11.example.stragery;

import java.util.ArrayList;
import java.util.List;

public class ShoppingClub {
	List<Item> items;
	
	public ShoppingClub(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getGp();
		}
		return sum;
	}
	
	public void pay(TransferStrategy paymentMethod){
		int gp = calculateTotal();
		paymentMethod.pay(gp);
	}
}
