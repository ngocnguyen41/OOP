package lap01;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        int countVowel = 0;
        int countDigit = 0;

        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char tempChar = inStr.charAt(charIdx);

            switch (tempChar) {
                case 'a', 'e', 'i', 'u', 'A', 'E', 'I', 'U':
                    countVowel += 1;
                    break;
                default:
                    if (Character.isDigit(tempChar)) {
                        countDigit += 1;
                    }
            }
        }
        double vowelsPercent = ((double)countVowel / (double)inStrLen) * 100;
        double digitsPercent = ((double)countDigit / (double)inStrLen) * 100;
        System.out.printf("Number of vowels: %d (%.2f%%)\n", countVowel, vowelsPercent);
        System.out.printf("Number of digits: %d (%.2f%%)\n", countDigit, digitsPercent);
    }
}