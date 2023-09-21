import java.util.*;
public class CountOfAnElementOfAnSortedArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10,10, 18, 20};
        int target = 10;
        int LastOccurrenceIndex = findLastOccurrence(arr, target);
        int firstOccurrenceIndex = findFirstOccurrence(arr, target);

        int result = LastOccurrenceIndex - firstOccurrenceIndex + 1;
        System.out.println(result);

    }
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid; // Update the first occurrence index
                high = mid - 1; // Search in the left half
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstOccurrence;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int firstOccurrence = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid; // Update the first occurrence index
                low = mid + 1; // Search in the left half
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstOccurrence;
    }
}
