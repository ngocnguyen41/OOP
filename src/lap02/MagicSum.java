package lap02;

import java.util.Scanner;

public class MagicSum {
	public static boolean hasEight(int number) {
		while (number > 0) {
			if (number % 10 == 8) return true;
			number = number / 10;
		}
		return false;
	}


	public static int sumMagic(Scanner keyboard) {
		int sum = 0;
		int number;
		do {
			System.out.print("Enter a positive integer (or -1 to end): ");
			number = keyboard.nextInt();
			if (hasEight(number)) {
				sum += number;
			}
		} while (number != -1);

		return sum;
	}


	public static void main(String[] args) {
		final int SENTINEL = -1;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer (or -1 to end): ");
		int number = in.nextInt();

		int sum = 0;
		while (number != SENTINEL) {
			if (hasEight(number) == true) {
				sum += number;
			}

			System.out.print("Enter a positive integer (or -1 to end): ");
			number = in.nextInt();
		}
		in.close();

		System.out.println("The magic sum is: " + sum);

//		Scanner keyboard = new Scanner(System.in);
//		int sum = sumMagic(keyboard);
//		System.out.println(sumMagic(keyboard));
//		keyboard.close();
	}
}