//Maximum of Array
//You are given an array arr of length n. You have to find the maximum element of the array.
//
//Note
//
//You have to use Recursion.
//
//Input Format
//The first line of input contains an integer n, size of the array.
//
//The next line contains n space seperated integers denoting the elements of the array.
//
//Output Format
//Print single integer representing maximum of the given array
//
//Example 1
//Input
//
//3
//2 3 10
//Output
//
//10
//Explanation
//
//10 is maximum among 2,3 and 10.
//
//Example 2
//Input
//
//4
//1 3 5 7
//Output
//
//7
//Explanation
//
//7 is maximum among 1,3,5 and 7.
//
//Constraints
//0 <= nums.length <= 100
//
//0 <= nums[i] <= 100000

package Recursion_On_Array;
import java.io.*;
import java.util.Scanner;
public class Maximum_of_Array {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
            {
                nums[i] = sc.nextInt();
            }
            int result=maxElement(nums,0);
            System.out.print(result);
        }

        public static int maxElement(int[] arr,int index){

            //Base case
            if(index == arr.length){
                return 0;
            }
            int max = maxElement(arr,index+1);
            if(arr[index] > max){
                max = arr[index];
            }
            return max;
        }
    }

