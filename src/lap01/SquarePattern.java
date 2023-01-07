package lap01;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = in.nextInt();

        System.out.println("For loops:");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("While-do loops:");
        int num = 1;
        while (num <= size * size) {
            System.out.print("# ");

            if (num % size == 0) {
                System.out.println();
            }
            num++;
        }
    }
}
