package lap02;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        final int numStudents;
        int[] grades;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = in.nextInt();

        grades = new int[numStudents];

        if (grades.length > 0) {
            for (int i = 0; i < grades.length; ++i) {
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                grades[i] = in.nextInt();
            }
        }
        in.close();

        double sum = 0;
        for (int i = 0; i < grades.length; i++)
            sum += grades[i];
        double average = sum / grades.length;
        System.out.printf("The average is: %.2f%n", average);

        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) min = grades[i];
        }
        System.out.println("The minimum is: " + min);

        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) max = grades[i];
        }
        System.out.println("The maximum is: " + max);
    }

}
