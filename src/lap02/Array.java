package lap02;

public class Array {
	// Ex 2.3:
	public static void print(int[] array) {
		System.out.print("[");
		if (array.length == 0)
			System.out.println("]");
		else {
			for (int i = 0; i < array.length; i++) {
				if (i == 0)
					System.out.print(array[i]);
				else
					System.out.print(", " + array[i]);
			}
			System.out.println("]");
		}
	}

	public static void print(double[] array) {
		System.out.print("[");
		if (array.length == 0)
			System.out.println("]");
		else {
			for (int i = 0; i < array.length; i++) {
				if (i == 0)
					System.out.print(array[i]);
				else
					System.out.print(", " + array[i]);
			}
			System.out.println("]");
		}
	}

	public static void print(float[] array) {
		System.out.print("[");
		if (array.length == 0)
			System.out.println("]");
		else {
			for (int i = 0; i < array.length; i++) {
				if (i == 0)
					System.out.print(array[i]);
				else
					System.out.print(", " + array[i]);
			}
			System.out.println("]");
		}
	}

	// Ex 2.4:
	public static String arrayToString(int[] array) {
		String str = "[";
		if (array.length == 0)
			str += "]";
		else {
			for (int i = 0; i < array.length; i++) {
				if (i == 0)
					str += String.valueOf(array[i]);
				else
					str = str + ", " + String.valueOf(array[i]);
			}
			str += "]";
		}
		return str;
	}

	public static String arrayToString2(int[] array) {
		StringBuilder arrString = new StringBuilder("[");
		for (int element : array) {
			arrString.append(element).append(", ");
		}
		arrString.delete(arrString.length() - 2, arrString.length());
		arrString.append("]");

		return arrString.toString();
	}

	// Ex 2.5:
	public static boolean contains(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return true;
		}
		return false;
	}

	// Ex 2.6:
	public static int search(int[] array, int key) {
		if (array == null) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	// Ex 2.7:
	public static boolean equals(int[] array1, int[] array2) {
		// array 1 vs null
		// null vs null
		if ((array1 == null && array2 == null) || (array1 == null || array2 != null) || (array1 != null || array2 == null)) {
			return false;
		}
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] == array2[i]) {
					return true;
				}
			}
		}
		return false;
	}

	// Ex 2.8:
	public static int[] copyOf(int[] array, int newLength) {
		int[] arrayCopy = new int[newLength];

		// check null

		if (array.length >= newLength) {
			for (int i = 0; i < newLength; i++) {
				arrayCopy[i] = array[i];
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				arrayCopy[i] = array[i];
			}
			for (int i = array.length; i < newLength; i++) {
				arrayCopy[i] = 0;
			}
		}
		return arrayCopy;
	}

	// Ex 2.9:
	public static boolean swap(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		} else {
			for (int i = 0; i < array1.length; i++) {
				int temp = array1[i];
				array1[i] = array2[i];
				array2[i] = temp;
			}
		}
		return true;
	}

	// Ex 2.10:
	public static void reverse(int[] array) {
		for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
			int temp = array[fIdx];
			array[fIdx] = array[bIdx];
			array[bIdx] = temp;
		}
	}

	public static void main(String[] args) {
		int[] testArr = {1, 2, 3, 4};
		int[] swapArr = {5, 6, 7, 8};
		int[] testArr2 = {1, 2, 3, 4};
		int[] copy;
		int newLength = 3;
		int key = 4;

		// Ex 2.3 test
		System.out.println("Ex 2.3 (print): ");
		System.out.print("The array is: ");
		print(testArr);
		System.out.println();

		// Ex 2.4 test
		System.out.println("Ex 2.4 (arrayToString): ");
		System.out.println("The array to String is: " + arrayToString(testArr));
		System.out.println("The array to String is: " + arrayToString2(testArr));
		System.out.println();

		// Ex 2.5 test
		System.out.println("Ex 2.5 (contain): ");
		System.out.print("The array is: ");
		print(testArr);

		System.out.println("Array contains " + key + ": " + contains(testArr, key));
		System.out.println();

		// Ex 2.6 test
		System.out.println("Ex 2.6 (search): ");
		System.out.print("The array is: ");
		print(testArr);

		if (search(testArr, key) != -1)
			System.out.println("The array index of " + key + " is: " + search(testArr, key));
		else
			System.out.println("Not found " + key + " in array");
		System.out.println();

		// Ex 2.7 test
		System.out.println("Ex 2.7 (equals): ");
		System.out.print("The array1 is: ");
		print(testArr);
		System.out.print("The array2 is: ");
		print(testArr2);
		System.out.println("The array1 is equal array2: " + equals(testArr, testArr2));
		System.out.println();

		// Ex 2.8 test
		System.out.println("Ex 2.8 (copyOf): ");
		copy = copyOf(testArr, newLength);
		System.out.print("The array1 is: ");
		print(testArr);
		System.out.print("The copy of array1 with new length is: ");
		print(copy);
		System.out.println();

		// Ex 2.9 test
		System.out.println("Ex 2.9 (swap):");
		System.out.print("The array1 is: ");
		print(testArr);
		System.out.print("The array2 is: ");
		print(swapArr);
		System.out.println("The contents are swapped: " + swap(testArr, swapArr));
		System.out.print("The array1 after swap: ");
		print(testArr);
		System.out.print("The array2 after swap: ");
		print(swapArr);
		System.out.println();

		// Ex 2.10 test
		System.out.println("Ex 2.10 (reverse):");
		System.out.print("The array is: ");
		print(testArr);
		reverse(testArr);
		System.out.println("The reverse array is: ");
		print(testArr);
	}
}