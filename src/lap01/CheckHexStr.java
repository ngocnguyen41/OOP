package lap01;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string : ");
        inStr = in.next();
        inStrLen = inStr.length();

        boolean isHexStr = true;
        for(int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if((inChar >= '0' && inChar <= '9' )
              || (inChar >= 'A' && inChar <= 'F' )
              || (inChar >= 'a' && inChar <= 'f' )) {
                isHexStr = true;
            }
        }

        if(isHexStr == true)
            System.out.println("'" + inStr + "' is a hex string");
        else
            System.out.println("'" + inStr +  "' is NOT a hex string");

    }
}