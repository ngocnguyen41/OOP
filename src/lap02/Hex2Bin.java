package lap02;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

        String inStr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string : ");
        inStr = in.next();
        in.close();

        System.out.print("The equivalent binary for hexadecimal '" + inStr + "' is: ");
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (inChar >= '0' && inChar <= '9') {
                System.out.print(HEX_BITS[Character.getNumericValue(inChar)] + " ");
            } else if (inChar != 'a') {
                System.out.print(HEX_BITS[10 + (inChar - 'a')] + " ");
            } else System.out.print(HEX_BITS[10] + " ");
        }
    }
}
