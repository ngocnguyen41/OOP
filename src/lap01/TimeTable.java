package lap01;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = in.nextInt();
        in.close();

        for (int row = -1; row <= size; row++) {
            if (row == -1) {
                System.out.printf("%4c %c", '*', '|');
                for (int col = 1; col <= size; col++) {
                    System.out.printf("%4d", col);
                }
                System.out.println();
            } else if (row == 0) {
                for (int col = 1; col <= size; col++) {
                    System.out.print("---");
                }
                System.out.println();
            } else {
                System.out.printf("%4d |", (row));
                for (int col = 1; col <= size; col++) {
                    System.out.printf("%4d", (row * col));
                }
                System.out.println();
            }
        }
    }
}
