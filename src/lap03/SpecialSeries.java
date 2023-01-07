package lap03;

import java.util.Scanner;

public class SpecialSeries {
	public static double specialSeries(double x, int numTerms) {

		double sum = x;
		for (int i = 1; i < numTerms; i++) {
			double temp = Math.pow(x, 2 * i + 1) / (2 * i + 1.0);
			for (int j = 2 * i - 1; j > 0; j -= 2) {
				temp *= j / (j + 1.0);
			}
			sum += temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		double x = 2.3;
		System.out.println("Enter index n: ");
		int numTerms = 9;

		System.out.println("Special Series is: " + specialSeries(x, numTerms));
	}
}
