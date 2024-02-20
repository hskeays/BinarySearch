import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        int answer = binarySearch(array, value);

        if (binarySearch(array, value) == -1) {
            System.out.println("Value does not exist in the array");
        } else {
            System.out.println("The index of value " + value + ": " + answer);
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
