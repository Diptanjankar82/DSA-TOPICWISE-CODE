package Recursion_On_Array;
import java.util.*;
public class Smallest_Number_in_an_Array_using_Recursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            sc.close();
            System.out.println(recforMin(arr, 0));
        }

        public static int recforMin(int[] arr, int idx) {
            //Write your code here
            if(idx >= arr.length){
                return Integer.MAX_VALUE;
            }
            int minInRest = recforMin(arr, idx + 1);
            int min = Math.min(arr[idx], minInRest);
            return min;
    }
}
