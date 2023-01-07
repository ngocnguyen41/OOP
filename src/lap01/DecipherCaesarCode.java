package lap01;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string : ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();

        String outStr = "";
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (inChar >= 'D' && inChar <= 'Z')
                outStr += (char) (inChar - 3);
            else if (inChar == 'A')
                outStr += 'X';
            else if (inChar == 'B')
                outStr += 'Y';
            else if (inChar == 'C')
                outStr += 'Z';
        }

        System.out.print("The plaintext string is: " + outStr);
    }
}
