package lap04;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i + 1;
            for (int j = i + 2; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};
        selectionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
