//Problem statement = Product of natural numbers
//Write a recursive program to find the product of all the Natural numbers till N. Take input of N from the user and write a recursive function that returns the product of all the Natural numbers until N.
//
//Input Format
//Enter an integer N (N>0)
//
//Output Format
//Print the product of all the Natural numbers between N and 1 (both included).
//
//Example 1
//Input
//
//5
//Output
//
//120
//Explanation
//
//5 * 4 * 3 * 2 * 1 = 120.

package RecursionInteger;
import java.util.*;
public class Product_of_natural_numbers {

        static long product(int n){
            //Write code here
           if(n == 0 || n ==1){
               return 1;
           }

          return n* product(n-1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println(product(n));
        }
    }
