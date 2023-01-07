package lap11.example.stragery;

public class TranferCard implements TransferStrategy {

	private String name;
	private int age;
	private String position;
	private String club;

	public TranferCard(String nm, int Age, String position, String club) {
		this.name = nm;
		this.age = age;
		this.position = position;
		this.club = club;
	}

	@Override
	public void pay(int gp) {
		System.out.println(gp + " tranfer");
	}

}
