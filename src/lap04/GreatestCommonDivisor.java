package lap04;

public class GreatestCommonDivisor {
	public static int gcd(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		}
		if (a == 0) {
			return b;
		}
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 56;
		if (gcd(num1, num2) == -1) {
			System.out.println("Error!");
		} else {
			System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd(num1, num2));
		}
	}
}
