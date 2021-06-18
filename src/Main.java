import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.nextLine());
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(BinarySearch.binarySearch(array, 0, array[array.length - 1], 5));
    }
}