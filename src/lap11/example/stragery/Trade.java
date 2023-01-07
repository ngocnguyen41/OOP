package lap11.example.stragery;

public class Trade implements TransferStrategy {

	private String id;
	private int gp;
	
	public Trade(String Id, int gp){
		this.id=Id;
		this.gp = gp;;
	}
	
	@Override
	public void pay(int gp) {
		System.out.println(gp + " be trade.");
	}

}
