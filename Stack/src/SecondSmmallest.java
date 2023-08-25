import java.util.Scanner;
public class SecondSmmallest {

        public static int findLargeSmallSum(int[] arr) {

            if (arr == null || arr.length < 4) {
                return 0;
            }


            int secondLargestEven = Integer.MIN_VALUE;
            int secondSmallestOdd = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    if (arr[i] > secondLargestEven) {
                        secondLargestEven = arr[i];
                    }
                } else {
                    if (arr[i] < secondSmallestOdd) {
                        secondSmallestOdd = arr[i];
                    }
                }
            }


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

