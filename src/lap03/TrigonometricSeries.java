package lap03;

public class TrigonometricSeries {
	public static double sin(double x, int numTerms) {
		double sin = x;
		double result = x;
		for (int i = 1; i <= numTerms; i++) {
			result = ((-1) * (result * x * x)) / ((2 * i + 1) * (2 * i));
			sin += result;
		}
		return sin;
	}

	public static double cos(double x, int numTerms) {
		double cos = 1;
		double result = 1;
		for (int i = 1; i <= numTerms; i++) {
			result = ((-1) * (result * x * x)) / ((2 * i) * (2 * i - 1));
			cos += result;
		}
		return cos;
	}

	public static void main(String[] args) {
		double x1 = 0;
		double x2 = Math.PI / 6;
		double x3 = Math.PI / 4;
		double x4 = Math.PI / 3;
		double x5 = Math.PI / 2;

		int numTerms = 5;

		System.out.println("sin(" + x1 + ") = " + sin(x1, numTerms) + " | " + "sin(" + x1 + ") = " + Math.sin(x1));
		System.out.println("cos(" + x1 + ") = " + cos(x1, numTerms) + " | " + "cos(" + x1 + ") = " + Math.cos(x1));
		System.out.println();

		System.out.println("sin(" + x2 + ") = " + sin(x2, numTerms) + " | " + "sin(" + x2 + ") = " + Math.sin(x2));
		System.out.println("cos(" + x2 + ") = " + cos(x2, numTerms) + " | " + "cos(" + x2 + ") = " + Math.cos(x2));
		System.out.println();

		System.out.println("sin(" + x3 + ") = " + sin(x3, numTerms) + " | " + "sin(" + x3 + ") = " + Math.sin(x3));
		System.out.println("cos(" + x3 + ") = " + cos(x3, numTerms) + " | " + "cos(" + x3 + ") = " + Math.cos(x3));
		System.out.println();

		System.out.println("sin(" + x4 + ") = " + sin(x4, numTerms) + " | " + "sin(" + x4 + ") = " + Math.sin(x4));
		System.out.println("cos(" + x4 + ") = " + cos(x4, numTerms) + " | " + "cos(" + x4 + ") = " + Math.cos(x4));
		System.out.println();

		System.out.println("sin(" + x5 + ") = " + sin(x5, numTerms) + " | " + "sin(" + x5 + ") = " + Math.sin(x5));
		System.out.println("cos(" + x5 + ") = " + cos(x5, numTerms) + " | " + "cos(" + x5 + ") = " + Math.cos(x5));
		System.out.println();

		System.out.println("=> The values computed using the series are approximated by JDK Math.sin(), Math.cos() methods");
	}
}
