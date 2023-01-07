package lap01;

import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int numRows = in.nextInt();
        in.close();

        System.out.println("Hill Pattern B:");
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= 2 * numRows - 1; col++) {
                if ((row + col <= 2 * numRows) && (col - row >= 0)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}