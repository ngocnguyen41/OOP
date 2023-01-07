package lap01;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string : ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();

        String cipherTextChar = "";
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char plainTextChar = inStr.charAt(charIdx);
            if (plainTextChar >= 'A' && plainTextChar <= 'Z')
                cipherTextChar += (char) ('A' + 'Z' - plainTextChar);
        }

        System.out.print("The ciphertext string is: " + cipherTextChar);
    }
}
