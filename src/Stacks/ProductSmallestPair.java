package Stacks;

import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallestPair {
    public static int productSmallestPair(int arr[], int n, int sum) {
        if (n < 2)
            return -1;

        Arrays.sort(arr);

        int check = arr[0] + arr[1];
        if (check <= sum)
            return arr[0] * arr[1];
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(productSmallestPair(arr, n, sum));
    }
}
