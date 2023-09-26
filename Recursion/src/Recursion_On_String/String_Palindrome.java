//String Palindrome
//A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left. So given a string str, determine whether it is a palindrome or not.
//
//Input Format
//The first line of input contains string str.
//
//Output Format
//Print YES or NO.
//
//EXAMPLE 1
//Input
//
//abba
//Output
//
//YES
//Explanation
//
//abba is a palindromic string.
//
//Example 2
//Input
//
//geeks
//Output
//
//NO
//Explanation
//
//geeks is not a palindromic string.
//
//Constraints
//0 <= |str| <=10000

package Recursion_On_String;
import java.io.*;
import java.util.Scanner;
public class String_Palindrome {
        static boolean isPalindrome(String str,int start,int end){
            // Write your code here

            if(start > end){
                return true;
            }
            if(str.charAt(start) == str.charAt(end)){
                return isPalindrome(str, start+1, end-1);
            }else{
                return false;
            }
        }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String str= sc.nextLine();
            boolean result=isPalindrome(str,0,str.length()-1);
            if(result)
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }

