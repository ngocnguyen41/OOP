package lap03;

public class FibonacciInt {
	public static int fibonacci(int n) {
		if (n <= 1 && n >=0) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= n; i++) {
			if (Integer.MAX_VALUE - fibonacci(n - 1) > fibonacci(n - 2)) {
				System.out.println("F(" + (n - 1) + ") = " + fibonacci(n));
				n++;
			} else {
				System.out.println("F(" + (n - 1) + ") is out of range of int");
				break;
			}
		}
	}
}
