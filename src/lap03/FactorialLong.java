package lap03;

public class FactorialLong {
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int n = 1;

		for (int i = 1; i <= n; i++) {
			System.out.println("The factorial of " + n + " is " + factorial(n));
			if (Long.MAX_VALUE / factorial(n) < n + 1) {
				n++;
				System.out.println("The factorial of " + n + " out of range");
				break;
			} else n++;
		}
	}
}