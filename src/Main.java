import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 0, 7, 9, 6, 1, 8};
        Arrays.sort(array);
        int value = 1;
        int answer = binarySearch(array, value);

        System.out.print("\nIf the provided array was not sorted, ");
        System.out.println("an element's index may have changed after sorting.\n");

        if (binarySearch(array, value) == -1) {
            System.out.println("The value does not exist in the array.");
        } else {
            System.out.println("The index with value " + value + ": " + answer);
        }
    }

    static int binarySearch(int[] array, int searchValue) {
        Arrays.sort(array);
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (array[mid] == searchValue) {
                return mid;
            } else if (array[mid] < searchValue) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}