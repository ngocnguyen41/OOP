package lap04;

public class PrefectPrimeFactorList {
	public static boolean isProductOfPrimeFactors(int aPosInt) {
		int result = 1;
		for (int i = 2; i <= aPosInt / 2; i++) {
			if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
				result *= i;
				if (result == aPosInt) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		System.out.println("The upper bound: " + num);
		System.out.println("These numbers areequal to the product of prime factors :");
		for (int i = 2; i <= num; i++) {
			if (isProductOfPrimeFactors(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("%s%d %s%.2f%s","[",count,"primes found (",100.0 * count / num,"%)]");
	}
}
