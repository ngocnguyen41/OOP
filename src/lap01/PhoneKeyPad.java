package lap01;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        String inStr; // input String
        int inStrLen; // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();

        System.out.println("(a)");
        System.out.print("Convert to a sequence of keypad digits usea a nested-if: ");
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.charAt(charIdx);
            if (inChar == 'a' || inChar == 'b' || inChar == 'c'
                    || inChar == 'A' || inChar == 'B' || inChar == 'C') {
                System.out.print(2);
            } else if (inChar == 'd' || inChar == 'e' || inChar == 'f'
                    || inChar == 'D' || inChar == 'E' || inChar == 'F') {
                System.out.print(3);
            } else if (inChar == 'g' || inChar == 'h' || inChar == 'i'
                    || inChar == 'G' || inChar == 'H' || inChar == 'I') {
                System.out.print(4);
            } else if (inChar == 'j' || inChar == 'k' || inChar == 'l'
                    || inChar == 'J' || inChar == 'K' || inChar == 'L') {
                System.out.print(5);
            } else if (inChar == 'm' || inChar == 'n' || inChar == 'o'
                    || inChar == 'M' || inChar == 'N' || inChar == 'O') {
                System.out.print(6);
            } else if (inChar == 'p' || inChar == 'q' || inChar == 'r' || inChar == 's'
                    || inChar == 'P' || inChar == 'Q' || inChar == 'R' || inChar == 'S') {
                System.out.print(7);
            } else if (inChar == 't' || inChar == 'u' || inChar == 'v'
                    || inChar == 'T' || inChar == 'U' || inChar == 'V') {
                System.out.print(8);
            } else if (inChar == 'w' || inChar == 'x' || inChar == 'y' || inChar == 'z'
                    || inChar == 'W' || inChar == 'X' || inChar == 'Y' || inChar == 'Z') {
                System.out.print(9);
            } else {
                System.out.print(inChar);
            }
        }
        System.out.println();

        System.out.println("(b)");
        System.out.print("Convert to a sequence of keypad digits usea a switch-case-default: ");
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char inChar = inStr.charAt(charIdx);
            switch (inChar) {
                case 'a', 'b', 'c', 'A', 'B', 'C':
                    System.out.print(2);
                    break;
                case 'd', 'e', 'f', 'D', 'E', 'F':
                    System.out.print(3);
                    break;
                case 'g', 'h', 'i', 'G', 'H', 'I':
                    System.out.print(4);
                    break;
                case 'j', 'k', 'l', 'J', 'K', 'L':
                    System.out.print(5);
                    break;
                case 'm', 'n', 'o', 'M', 'N', 'O':
                    System.out.print(6);
                    break;
                case 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S':
                    System.out.print(7);
                    break;
                case 't', 'u', 'v', 'T', 'U', 'V':
                    System.out.print(8);
                    break;
                case 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z':
                    System.out.print(9);
                    break;
                default:
                    System.out.print(inChar);
            }
        }
    }
}
