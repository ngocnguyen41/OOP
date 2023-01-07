package lap04;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1 , 2, 3, 4, 5, 6, 7};
        int num = -1;

        if (linearSearch(array, num)) {
            System.out.println("Element " + num + " has index " + linearSearchIndex(array, num) + " in array" );
        } else {
            System.out.println("Element " + num + " isn't in array");
        }
    }
}
