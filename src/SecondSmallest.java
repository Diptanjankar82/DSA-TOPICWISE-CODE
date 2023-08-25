import java.util.Scanner;
public class SecondSmallest {


    public class LargeSmallSum {

        public static int findLargeSmallSum(int[] arr) {
            // Check if the array is empty or has less than 4 elements
            if (arr == null || arr.length < 4) {
                return 0;
            }

            // Initialize variables to store the second largest from even positions and
            // the second smallest from odd positions
            int secondLargestEven = Integer.MIN_VALUE;
            int secondSmallestOdd = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) { // Even position
                    if (arr[i] > secondLargestEven) {
                        secondLargestEven = arr[i];
                    }
                } else { // Odd position
                    if (arr[i] < secondSmallestOdd) {
                        secondSmallestOdd = arr[i];
                    }
                }
            }

            // Return the sum of the second largest even and second smallest odd
            return secondLargestEven + secondSmallestOdd;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();

            int[] arr = new int[length];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Result: " + findLargeSmallSum(arr));

            scanner.close();
        }
    }
}
