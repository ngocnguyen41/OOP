package hw6.ex1_5;

import java.util.Arrays;
import java.util.Comparator;

public class CountryArrayManager {
	private Country[] countries;
	private int length;
	private int increment;

	public CountryArrayManager() {
		this.increment = 10;
		countries = new Country[this.increment];
		this.length = 0;
	}

	public CountryArrayManager(int maxLength) {
		this.increment = 10;
		countries = new Country[maxLength];
		this.length = 0;
	}

	public int getLength() {
		return this.length;
	}

	public Country[] getCountries() {
		return this.countries;
	}

	private void correct() {
		int nullFirstIndex = 0;
		for (int i = 0; i < this.countries.length; i++) {
			if (this.countries[i] == null) {
				nullFirstIndex = i;
				break;
			}
		}

		if (nullFirstIndex > 0) {
			this.length = nullFirstIndex;
			for (int i = nullFirstIndex; i < this.countries.length; i++) {
				this.countries[i] = null;
			}
		}
	}

	private void allocateMore() {
		Country[] newArray = new Country[this.countries.length + this.increment];
		System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
		this.countries = newArray;
	}

	public void append(Country country) {
		if (this.length >= this.countries.length) {
			allocateMore();
		}

		this.countries[this.length] = country;
		this.length++;
	}

	public boolean add(Country country, int index) {
		if ((index < 0) || (index > this.countries.length)) {
			return false;
		}

		if (this.length >= this.countries.length) {
			allocateMore();
		}

		for (int i = this.length; i > index; i--) {
			this.countries[i] = this.countries[i - 1];
		}

		this.countries[index] = country;
		this.length++;
		return true;
	}

	public boolean remove(int index) {
		if ((index < 0) || (index >= countries.length)) {
			return false;
		}

		for (int i = index; i < length - 1; i++) {
			this.countries[i] = this.countries[i + 1];
		}

		this.countries[this.length - 1] = null;
		this.length--;
		return true;
	}

	public Country countryAt(int index) {
		if ((index < 0) || (index >= this.length)) {
			return null;
		}

		return this.countries[index];
	}

	/**
	 * Sort the countries in order of increasing population
	 * using selection sort algorithm.
	 *
	 * @return array of increasing population countries.
	 */
	public Country[] sortByIncreasingPopulation() {
		Country[] newArray = new Country[this.length];
		System.arraycopy(this.countries, 0, newArray, 0, this.length);

		/* TODO */

		int num = newArray.length;

		for (int index = 0; index < num - 1; index++) {
			int min_index = index;
			for (int j = index + 1; j < num; j++)
				if (newArray[j].getPopulation() < newArray[min_index].getPopulation()) min_index = j;

			Country temp = newArray[min_index];
			newArray[min_index] = newArray[index];
			newArray[index] = temp;
		}

		return newArray;
	}

	/**
	 * Sort the countries in order of decreasing population
	 * using selection sort algorithm.
	 *
	 * @return array of decreasing population countries.
	 */
	public Country[] sortByDecreasingPopulation() {
		Country[] newArray = new Country[this.length];
		System.arraycopy(this.countries, 0, newArray, 0, this.length);

		/* TODO */

		int num = newArray.length;

		for (int index = 0; index < num - 1; index++) {
			int max_index = index;
			for (int j = index + 1; j < num; j++)
				if (newArray[j].getPopulation() > newArray[max_index].getPopulation()) max_index = j;

			Country temp = newArray[max_index];
			newArray[max_index] = newArray[index];
			newArray[index] = temp;
		}

		return newArray;
	}

	/**
	 * Sort the countries in order of increasing area
	 * using bubble sort algorithm.
	 *
	 * @return array of increasing area countries.
	 */
	public Country[] sortByIncreasingArea() {
		Country[] newArray = new Country[this.length];
		System.arraycopy(this.countries, 0, newArray, 0, this.length);

		/* TODO */
		int num = newArray.length;
		for (int index = 0; index < num - 1; index++)
			for (int j = 0; j < num - index - 1; j++)
				if (newArray[j].getArea() > newArray[j + 1].getArea()) {
					Country temp = newArray[j];
					newArray[j] = newArray[j + 1];
					newArray[j + 1] = temp;
				}

		return newArray;
	}

	/**
	 * Sort the countries in order of decreasing area
	 * using bubble sort algorithm.
	 *
	 * @return array of increasing area countries.
	 */
	public Country[] sortByDecreasingArea() {
		Country[] newArray = new Country[this.length];
		System.arraycopy(this.countries, 0, newArray, 0, this.length);

		/* TODO */
		int num = newArray.length;
		for (int index = 0; index < num - 1; index++)
			for (int j = 0; j < num - index - 1; j++)
				if (newArray[j].getArea() < newArray[j + 1].getArea()) {
					Country temp = newArray[j];
					newArray[j] = newArray[j + 1];
					newArray[j + 1] = temp;
				}

		return newArray;
	}

	/**
	 * Sort the countries in order of increasing GDP
	 * using insertion sort algorithm.
	 *
	 * @return array of increasing GDP countries.
	 */
	public Country[] sortByIncreasingGdp() {
		Country[] newArray = new Country[this.length];
		System.arraycopy(this.countries, 0, newArray, 0, this.length);

		/* TODO */
		int n = newArray.length;
		for (int index = 1; index < n; ++index) {
			Country key = newArray[index];
			int newIndex = index - 1;

			while (newIndex >= 0 && newArray[newIndex].getGdp() > key.getGdp()) {
				newArray[newIndex + 1] = newArray[newIndex];
				newIndex = newIndex - 1;
			}
			newArray[newIndex + 1] = key;
		}

		return newArray;
	}

	/**
	 * Sort the countries in order of increasing GDP
	 * using insertion sort algorithm.
	 *
	 * @return array of increasing insertion countries.
	 */
	public Country[] sortByDecreasingGdp() {
		Country[] newArray = new Country[this.length];
		System.arraycopy(this.countries, 0, newArray, 0, this.length);

		/* TODO */
		int n = newArray.length;
		for (int index = 1; index < n; ++index) {
			Country key = newArray[index];
			int newIndex = index - 1;

			while (newIndex >= 0 && newArray[newIndex].getGdp() < key.getGdp()) {
				newArray[newIndex + 1] = newArray[newIndex];
				newIndex = newIndex - 1;
			}
			newArray[newIndex + 1] = key;
		}

		return newArray;
	}

	public AfricaCountry[] filterAfricaCountry() {
		/* TODO */
		AfricaCountry[] africaCountry = new AfricaCountry[getLength()];
		for (int index = 0; index < getLength(); index++) {
			if (getCountries()[index].getClass().getName().equals("hw6.ex1_5.AfricaCountry")) {
				africaCountry[index] = (AfricaCountry) getCountries()[index];
			}
		}
		return africaCountry;
	}

	public AsiaCountry[] filterAsiaCountry() {
		/* TODO */
		AsiaCountry[] asiaCountries = new AsiaCountry[getLength()];
		for (int index = 0; index < getLength(); index++) {
			if (getCountries()[index].getClass().getName().equals("hw6.ex1_5.AsiaCountry")) {
				asiaCountries[index] = (AsiaCountry) getCountries()[index];
			}
		}
		return asiaCountries;
	}

	public EuropeCountry[] filterEuropeCountry() {
		/* TODO */
		EuropeCountry[] europeCountries = new EuropeCountry[getLength()];
		for (int index = 0; index < getLength(); index++) {
			if (getCountries()[index].getClass().getName().equals("hw6.ex1_5.EuropeCountry")) {
				europeCountries[index] = (EuropeCountry) getCountries()[index];
			}
		}
		return europeCountries;
	}

	public NorthAmericaCountry[] filterNorthAmericaCountry() {
		/* TODO */
		NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[getLength()];
		for (int index = 0; index < getLength(); index++) {
			if (getCountries()[index].getClass().getName().equals("hw6.ex1_5.NorthAmericaCountry")) {
				northAmericaCountries[index] = (NorthAmericaCountry) getCountries()[index];
			}
		}
		return northAmericaCountries;
	}

	public OceaniaCountry[] filterOceaniaCountry() {
		/* TODO */
		OceaniaCountry[] oceaniaCountries = new OceaniaCountry[getLength()];
		for (int index = 0; index < getLength(); index++) {
			if (getCountries()[index].getClass().getName().equals("hw6.ex1_5.OceaniaCountry")) {
				oceaniaCountries[index] = (OceaniaCountry) getCountries()[index];
			}
		}
		return oceaniaCountries;
	}

	public SouthAmericaCountry[] filterSouthAmericaCountry() {
		/* TODO */
		SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[getLength()];
		for (int index = 0; index < getLength(); index++) {
			if (getCountries()[index].getClass().getName().equals("hw6.ex1_5.SouthAmericaCountry")) {
				southAmericaCountries[index] = (SouthAmericaCountry) getCountries()[index];
			}
		}
		return southAmericaCountries;
	}

	public Country[] filterMostPopulousCountries(int howMany) {
		/* TODO */
		Country[] newCountries = new Country[howMany];
		Country[] sortedCountries = sortByDecreasingPopulation();

		for (int index = 0; index < howMany; index++) {
			newCountries[index] = sortedCountries[index];
		}

		return newCountries;
	}

	public Country[] filterLeastPopulousCountries(int howMany) {
		/* TODO */
		Country[] newCountries = new Country[howMany];
		Country[] sortedCountries = sortByIncreasingPopulation();

		for (int index = 0; index < howMany; index++) {
			newCountries[index] = sortedCountries[index];
		}

		return newCountries;
	}

	public Country[] filterLargestAreaCountries(int howMany) {
		/* TODO */
		Country[] newCountries = new Country[howMany];
		Country[] sortedCountries = sortByDecreasingArea();

		for (int index = 0; index < howMany; index++) {
			newCountries[index] = sortedCountries[index];
		}

		return newCountries;
	}

	public Country[] filterSmallestAreaCountries(int howMany) {
		/* TODO */
		Country[] newCountries = new Country[howMany];
		Country[] sortedCountries = sortByIncreasingArea();

		for (int index = 0; index < howMany; index++) {
			newCountries[index] = sortedCountries[index];
		}

		return newCountries;
	}

	public Country[] filterHighestGdpCountries(int howMany) {
		/* TODO */
		Country[] newCountries = new Country[howMany];
		Country[] sortedCountries = sortByDecreasingGdp();

		for (int index = 0; index < howMany; index++) {
			newCountries[index] = sortedCountries[index];
		}

		return newCountries;
	}

	public Country[] filterLowestGdpCountries(int howMany) {
		/* TODO */
		Country[] newCountries = new Country[howMany];
		Country[] sortedCountries = sortByIncreasingGdp();

		for (int index = 0; index < howMany; index++) {
			newCountries[index] = sortedCountries[index];
		}

		return newCountries;
	}

	public static String codeOfCountriesToString(Country[] countries) {
		StringBuilder codeOfCountries = new StringBuilder();
		codeOfCountries.append("[");
		for (int i = 0; i < countries.length; i++) {
			Country country = countries[i];
			if (country != null) {
				codeOfCountries.append(country.getCode()).append(" ");
			}
		}

		return codeOfCountries.toString().trim() + "]";
	}

	public static void print(Country[] countries) {
		StringBuilder countriesString = new StringBuilder();
		countriesString.append("[");
		for (int i = 0; i < countries.length; i++) {
			Country country = countries[i];
			if (country != null) {
				countriesString.append(country.toString()).append("\n");
			}
		}
		System.out.print(countriesString.toString().trim() + "]");
	}
}
