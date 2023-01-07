package lap11.example.singleton;

public class Country {
	private static Country area;
	public double value;

	private Country(double value) {
		this.value = value;
	}

	public static Country getArea(double value) {
		if (area == null) {
			area = new Country(value);
		}
		return area;
	}
}
