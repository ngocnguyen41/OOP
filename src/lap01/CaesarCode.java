package lap01;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string : ");
        inStr = in.next().toUpperCase();
        inStrLen = inStr.length();

        String outStr = "";
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if(inChar >= 'A' && inChar <= 'W')
                outStr += (char)(inChar + 3);
            else if(inChar == 'X')
                outStr += 'A';
            else if(inChar == 'Y')
                outStr += 'B';
            else if(inChar == 'Z')
                outStr += 'C';
        }
        System.out.print("The ciphertext string is: " + outStr);
    }
}
