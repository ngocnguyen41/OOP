package lap02;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics2 {
	public static int[] grades; // Declare an int[], to be allocated later.
	// This array is accessible by all the methods .

	public static void main(String[] args) {
		readGrades(); // Read and save the inputs in static int[] grades
		System.out.print("The grades are: ");
		print(grades);
		System.out.printf("The average is %.2f%n", average(grades));
		System.out.printf("The median is %.2f%n", median(grades));
		System.out.println("The minimum is " + min(grades));
		System.out.println("The maximum is " + max(grades));
		System.out.printf("The standard deviation is %.2f%n", stdDev(grades));
	}

	// Prompt user for the number of students and allocate the static "grades"
	// array.
	// Then, prompt user for grade, check for valid grade, and store in "grades".
	public static void readGrades() {
		int numStudents;

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
	}

	// Print the given int array in the form of [x1 , x2 , x3 , . . . , xn].
	public static void print(int[] array) {
		System.out.print("[");
		if (array.length == 0) System.out.println("]");
		else {
			for (int i = 0; i < array.length; i++) {
				if (i == 0) System.out.print(array[i]);
				else System.out.print(", " + array[i]);
			}
			System.out.println("]");
		}
	}

	// Return the average value of the given int[]
	public static double average(int[] array) {
		double sum = 0;

		for (int i = 0; i < array.length; i++)
			sum += array[i];
		double average = sum / array.length;

		return average;
	}

	// Return the median value of the given int[]
	// Median is the center element for odd−number array ,
	// or average of the two center elements for even−number array .
	// Use Arrays.sort(anArray) to sort anArray in place .
	public static double median(int[] array) {
		int arrLen = array.length;

		Arrays.sort(array);
		if ((arrLen % 2) == 0) return (array[arrLen / 2] + array[(arrLen / 2) - 1]) / 2;
		else return array[arrLen / 2];
	}

	// Return the maximum value of the given int[]
	public static int max(int[] array) {
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) max = array[i];
		}

		return max;
	}

	// Return the minimum value of the given int[]
	public static int min(int[] array) {
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) min = array[i];
		}

		return min;
	}

	// Return the standard deviation of the given int[]
	public static double stdDev(int[] array) {
		double mean = average(array);
		double stdDev = 0;

		for (int i = 0; i < array.length; i++) {
			stdDev += Math.pow((array[i] - mean), 2);
		}

//		for (int i = 0; i < array.length; i++) {
//			stdDev += Math.pow((array[i]), 2);
//		}
//
//		stdDev -= Math.pow(mean, 2);

		stdDev = Math.sqrt(stdDev / array.length);
		return stdDev;
	}
}
