//Print Reverse Array Recursively
//You are given an array arr of n elements, you are required to print all the n elements but in a reverse order, in a single line.
//
//Note: Print the elements using a Recursive approach and not using loops(for, while, etc).
//
//Input Format
//First line contains an integer n which is the number of elements.
//
//Second line contains n space separated integers.
//
//Output Format
//Print all the n elements but in reverse space-separated in a single line
//
//Example 1
//Input
//
//4
//1 2 3 4
//Output
//
//4 3 2 1
//Constraints
//1 <= n <= 1000
//
//0 <= arr[i] <= 1000
package Recursion_On_Array;
import java.util.*;
public class Print_Reverse_Array_Recursively {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            PrintReverseArray(arr, n,n-1);
        }

        public static void PrintReverseArray(int[] arr, int n,int index) {
            //Write your code

            if(index < 0){
                return;
            }
            System.out.print(arr[index]+" ");
            PrintReverseArray(arr,n,index-1);

        }

    }

