package Recursion_On_Array;
import java.util.*;
public class Sumof_Array_elements_using_Recursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println(sumofArrayRec(arr, n,0));
        }

        public static int sumofArrayRec(int[] arr, int n, int index) {
            // write code here
            if(index == n){
                return 0;
            }
            int ans = sumofArrayRec(arr,n,index+1);
            int finalans;
            return finalans = ans + arr[index];
        }
    }


