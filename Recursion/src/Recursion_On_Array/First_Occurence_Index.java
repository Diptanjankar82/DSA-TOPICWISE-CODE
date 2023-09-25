//First Occurence Index
//You are given an array A of size N with possibly duplicate elements. Your task is to find the index of first occurence of an element T in the given array. Also, return -1 if the element is not present.
//
//You have to complete firstIndex function which contains array A , integers T (target) and startIndex as inputs and returns the first index of occurence as integer output
//
//Input Format
//First line represents size of the array i.e. N
//
//Second line represents n-spaced array elements of the array.
//
//Third line represents element T for which we have to find the first index of occurence.
//
//Output Format
//Print the integer value i.e. first index of occurence of the element.
//
//Example 1
//Input
//
//6
//5 6 4 6 1 2
//6
//Output
//
//1
//Explanation
//
//6 is present twice in the input array and the first time it appears is at index 1.
//
//Example 2
//Input
//
//8
//3 9 2 6 1 4 2 1
//7
//Output
//
//-1
//Explanation
//
//7 is not present in the array so the output is -1.
//
//Constraints
//0 <= N <= 10^5
//
//-10^9 <= A[i] <= 10^9
//
//-10^9 <= T <= 10^9

package Recursion_On_Array;

import java.util.Scanner;
public class First_Occurence_Index {
        static Scanner s = new Scanner(System.in);
        public static int[] takeInput(){
            int N = s.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = s.nextInt();
            }
            return A;
        }

        public static void main(String[] args) {
            int[] A = takeInput();
            int T = s.nextInt();
            System.out.println(firstIndex(A, T, 0));
        }

        static int firstIndex(int A[],int T,int startIndex)
        {
            //Base case
            if(startIndex == A.length){
                return -1;
            }
            //Recursive call
            if(A[startIndex] == T){
                return startIndex;
            }
          return  firstIndex(A,T,startIndex+1);

        }
    }

