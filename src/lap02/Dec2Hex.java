package lap02;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        final String hexDigits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int number = in.nextInt();
        in.close();

        int results;
        String hex = "";
        while (number > 0) {
            results = number % 16;
            hex = hexDigits[results] + hex;
            number = number / 16;
        }
        System.out.println("The equivalent hexadecimal number is: " + hex);
    }
}
