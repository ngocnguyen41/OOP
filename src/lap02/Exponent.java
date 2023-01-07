package lap02;

public class Exponent {
    public static int exponent(int base, int exp) {
        int expValue = 1;

        for (int i = 0; i < exp; i++) {
            expValue *= base;
        }
        return expValue;
    }

    public static void main(String[] args) {
        int base = 5;
        int exp = 7;

        int result = exponent(base, exp);
        System.out.println(base + " raise to the power of " + exp + " is: " + result);
    }
}

