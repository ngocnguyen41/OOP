package lap10.ex2_4;

public interface Poly {
	double[] coefficients();
	double coefficient(int degree);
	int degree();
	Poly derivative();
}
