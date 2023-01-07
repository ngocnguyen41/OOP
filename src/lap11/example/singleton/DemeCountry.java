package lap11.example.singleton;

public class DemeCountry {
	public static void main(String[] args) {
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n");
		Country country = Country.getArea(87465);
		Country anotherCountry = Country.getArea(87464);
		System.out.println(country.value);
		System.out.println(anotherCountry.value);
	}
}
