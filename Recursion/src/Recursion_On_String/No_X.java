//Problem statement =No X
//Given a string, compute recursively a new string where all the x chars have been removed.
//
//Input Format
//Only line contains the string S.
//
//Output Format
//Print the string with no x.
//
//Example 1
//Input
//
//xaaax
//Output
//
//aaa
//Explanation
//
//Remove the x at the start and the end.
//
//Example 2
//Input
//
//xaxb
//Output
//
//ab
//Explanation
//
//Remove the x at 0th and 2nd position.
//
//Example 3
//Input
//
//xxx
//Output
//
//Explanation
//
//Remove all the x so the string becomes empty.
//
//Constraints
//1 <= s.length() <= 10 ^ 4

package Recursion_On_String;
import java.util.*;
public class No_X {
        static String noX(String s) {
            // Write your code here
            if(s.isEmpty()){
                return " ";
            }

            char FirstCharacter = s.charAt(0);

            if(FirstCharacter == 'x'){
                return noX(s.substring(1));
            }else {
                return FirstCharacter + noX(s.substring(1));
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();
            System.out.println(noX(s));
        }
    }

