package lap01;

import java.util.Scanner;

public class Hex2Dec {
    public static boolean isHexString(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F')
                    || (inChar >= 'a' && inChar <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inStr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string : ");
        inStr = in.next();

        if (isHexString(inStr)) {
            int results = Integer.parseInt(inStr, 16);
            System.out.println("The equivalent decimal number for hexadecimal " + inStr + " is: " + results);
        } else
            System.out.println("error : invalid hexadecimal string " + inStr);
    }

}
