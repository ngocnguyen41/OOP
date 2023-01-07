package lap06.ex1_2;

public class Person {
	private String name;
	private String adderss;

	public Person () {
		this.name = "Vi Et";
		this.adderss = "Ha Noi";
	}
	public Person(String name, String adderss) {
		this.name = name;
		this.adderss = adderss;
	}

	public String getName() {
		return name;
	}

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

	@Override
	public String toString() {
		return "Person[" + "name = " + name + ", adderss = " + adderss + ']';
	}
}
