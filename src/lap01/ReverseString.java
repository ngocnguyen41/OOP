package lap01;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next();
        inStrLen = inStr.length();
        in.close();

        String outStr = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            outStr += inStr.charAt(charIdx);
        }

        System.out.print("The reverse of the String " + inStr + " is " + outStr);
    }
}
