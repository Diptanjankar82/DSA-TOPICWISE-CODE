//problrm statement = Find Indices
//Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array recursively and print them.
//
//Input Format
//The first line of input is the size of array N and an integer X denoting the number whose indices need to be printed. the second line consists of N integers separated by space denoting array arr.
//
//Output Format
//print the indices where X is there in array in order
//
//Example
//Input
//
//6 2
//1 2 3 2 3 5
//Output
//
//1 3
//Explanation
//
//2 is present on index 1 and index 3 in the provided array
//
//Constraints
//1 <= N <= 1000
//1 <= X <= 1000
//-10^6 <= arr[i] <= 10^6

package Recursion_On_Array;
import java.util.*;
public class Find_Indices {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n,x;
            n = sc.nextInt();
            x = sc.nextInt();
            int arr1[] = new int[n];
            for(int i=0;i<n;i++)
                arr1[i] = sc.nextInt();
            findX(arr1, n, x,0);
        }



        static void findX(int arr[], int n, int x,int index)
        {
//          for (int i =0; i<arr.length;i++){
//              if(arr[i] == x){
//                  System.out.print(i + " ");;
//              }
//          }
            //base case
            if(index == n){
                return;
            }
            if(arr[index] == x){
                System.out.println(index);
            }
            findX(arr,n,x,index+1);

        }
    }

