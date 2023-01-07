package lap04;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		int num = -10;

		if (fibonacci(num) == -1) {
			System.out.println("Error!");
		} else {
			System.out.println("fibonacci(" + num + ") = " + fibonacci(num));
		}
	}
}
