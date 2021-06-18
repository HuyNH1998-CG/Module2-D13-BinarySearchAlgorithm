public class BinarySearch {
    //left mean array min, right mean array max, ( find in range left to right)
    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
