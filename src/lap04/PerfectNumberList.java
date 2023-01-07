package lap04;

public class PerfectNumberList {
	public static boolean isPerfect(int aPosInt) {
		int result = 1;
		for (int i = 2; i < aPosInt; i++) {
			if (aPosInt % i == 0) {
				result += i;
				}
			}
		if (result == aPosInt) {
			return true;
		}
		return false;
	}

	public static boolean isDefiecient(int aPosInt) {
		int result = 1;
		for (int i = 2; i < aPosInt; i++) {
			if (aPosInt % i == 0) {
				result += i;
			}
		}
		if (result < aPosInt) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 1000;
		int count1 = 0;
		int count2 = 0;

		System.out.println("The upper bound: " + num);
		System.out.println("These numbers are perfect :");
		for (int i = 2; i <= num; i++) {
			if (isPerfect(i)) {
				System.out.print(i + " ");
				count1++;
			}
		}
		System.out.println();
		System.out.printf("%s%d %s%.2f%s","[",count1,"primes found (",100.0 * count1 / num,"%)]");

		System.out.println();
		System.out.println("These numbers are neither deficient nor perfect :");
		for (int i = 2; i <= num; i++) {
			if (!isDefiecient(i) && !isPerfect(i)) {
				System.out.print(i + " ");
				count2++;
			}
		}
		System.out.println();
		System.out.printf("%s%d %s%.2f%s","[",count2,"primes found (",100.0 * count2 / num,"%)]");

	}
}
