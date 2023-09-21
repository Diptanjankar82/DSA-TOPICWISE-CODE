import java.util.*;

public class LastOccurence {
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

    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        int firstOccurrenceIndex = findLastOccurrence(arr, target);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of " + target + " is at index " + firstOccurrenceIndex);
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}