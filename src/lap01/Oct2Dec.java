package lap01;

import java.util.Scanner;

public class Oct2Dec {

    public static boolean isOctString(String inStr) {
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (!(inChar >= '0' && inChar <= '7')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inStr; // input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Octal string : ");
        inStr = in.next();

        if (isOctString(inStr)) {
            int results = Integer.parseInt(inStr, 8);
            System.out.println("The equivalent decimal number " + inStr + " is: " + results);
        } else
            System.out.println("error : invalid Octal string " + inStr);
    }

}
