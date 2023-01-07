package lap01;

import java.util.Scanner;

public class Bin2Dec {

    public static boolean isBinaryString(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (inChar == '0' || inChar == '1') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string : ");
        inStr = in.next();
        inStrLen = inStr.length();

        if(isBinaryString(inStr)) {
            int results = 0;
            for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
                char inChar = inStr.charAt(charIdx);
                if(inChar == '1')
                    results += (int)Math.pow(2, (inStrLen - 1 - charIdx));
            }
            System.out.println("The equivalent decimal number for binary " + inStr + " is: " + results);
        } else
            System.out.println("error : invalid binary string " + inStr);
    }
}
