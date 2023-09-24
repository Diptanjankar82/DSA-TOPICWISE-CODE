
//Problem statement = (Sum of natural numbers)
//Write a recursive program to find out the sum of all natural numbers till N. Take input of N from the user and make a recursive function that returns the sum of all the natural numbers upto N.
//
//Input Format
//First line is an integer N
//
//Output Format
//Print the sum of first N natural numbers.
//
//Example 1
//Input
//
//5
//Output
//
//15

package RecursionInteger;
import java.util.*;
public class Sum_of_natural_numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(sumOfNaturalNumbers(n));
        }

        public static int sumOfNaturalNumbers(int n) {
          if(n ==0){
              return 0;
          }
          return n+ sumOfNaturalNumbers(n-1);
        }
    }


