package lap04;

public class GCD {
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 0;
        if (gcd(num1, num2) == -1) {
            System.out.println("Error!");
        } else {
            System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd(num1, num2));
        }
    }
}
