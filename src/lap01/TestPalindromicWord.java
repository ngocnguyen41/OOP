package lap01;

import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        int fIdx = 0;
        int bIdx = inStrLen - 1;
        boolean isPalindromicWord = true;
        while (fIdx < bIdx) {
            if (inStr.charAt(fIdx) == inStr.charAt(bIdx))
                isPalindromicWord = true;
            else {
                isPalindromicWord = false;
                break;
            }
            ++fIdx;
            --bIdx;
        }
        if (isPalindromicWord) {
            System.out.println("'" + inStr + "' is palindrome");
        } else {
            System.out.println("'" + inStr + "' is not palindrome");
        }
    }
}