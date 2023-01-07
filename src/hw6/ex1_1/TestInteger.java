package hw6.ex1_1;

import java.math.BigInteger;

public class TestInteger {
	public static void main(String[] args) {
		BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111111");
		BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
		System.out.println("Sum of two Big Integers: " + i1.add(i2));
		System.out.println("Muliply of two Big Integers: " + i1.multiply(i2));

	}
}
