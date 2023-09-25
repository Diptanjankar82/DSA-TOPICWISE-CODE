package Recursion_On_Array;
import java.util.*;
public class Print_Array_Recursively {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            PrintArray(arr, n,0);
        }

        public static void PrintArray(int[] arr, int n,int index) {
            // Write your code here
            if(index == n){
                return;
            }
            System.out.print(arr[index]+" ");
            PrintArray(arr,n,index+1);
        }

    }

