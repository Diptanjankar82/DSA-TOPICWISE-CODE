import java.util.Scanner;

public class zeroSoneS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the element in array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SearchZeroOne(arr);

        System.out.println("Modified array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void SearchZeroOne(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }
}
