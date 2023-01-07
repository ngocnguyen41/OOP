package lap04;

public class PrimeList {
	public static boolean isPrime(int aPosInt) {
		if (aPosInt < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
			if (aPosInt % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 0;
		int num = 10000;
		System.out.println("The upper bound: " + num);
		for (int i = 2; i < num; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.printf("%s%d %s%.2f%s","[",count,"primes found (",100.0 * count / num,"%)]");
	}
}
