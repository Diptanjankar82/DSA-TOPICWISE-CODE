//Check whether Array is a Palindrome using Recursion
//Given an array arr of length n, you have to find whether the given array is a palindrome using recursion.
//
//Note: A palindrome is an array which reads the same both forwards and backwards.
//
//Input Format
//First line consists of an integer n, the number of elements in the array
//
//Second line consists of n spaced inetegrs, representing the array arr.
//
//Output Format
//Print true if the array is a palindrome else print false.
//
//Example 1
//Input
//
//4
//4 3 2 10
//Output
//
//false
//Explanation
//
//Backwards, it reads 10, 2, 3, 4 which is not the same

package Recursion_On_Array;
import java.util.*;
public class Check_Palindrome_Array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            sc.close();

            System.out.println(isPalindrome(arr, n));
        }

        public static boolean isPalindrome(int[] arr, int n) {
            int res = isPalindromic(arr, 0, n - 1);
            if (res == 1)
                return true;
            return false;
        }

        public static int isPalindromic(int[] arr, int begin, int end) {
            if(begin >= end){
                return 1;
            }
            if(arr[begin] != arr[end]){
                return 0;
            }
            return isPalindromic(arr,begin+1,end-1);
        }

}


