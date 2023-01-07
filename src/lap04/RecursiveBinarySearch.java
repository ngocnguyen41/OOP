package lap04;

public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {12, 13, 16, 22, 26, 27, 37, 41, 47};
        int num = 22;
//      int num = 23;   // num = 12 isn't in array.

        if (binarySearch(array,num)){
            System.out.println("Element " + num + " is in array");
        }else {
            System.out.println("Element " + num + " isn't in array");
        }
    }
}
