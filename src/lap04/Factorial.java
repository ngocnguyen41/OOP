package lap04;

public class Factorial {
	public static int factorial(int n) {
		if (n < 0) {
			return -1;
		}
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
	}

	public static void main(String[] args) {
        int num = 4;

		if (factorial(num) == -1) {
			System.out.println("Error!");
		} else {
			System.out.println("fibonacci(" + num + ") = " + factorial(num));
		}
	}
}
