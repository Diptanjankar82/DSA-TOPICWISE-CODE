//PROBLEM STATEMENT = Print between X & Y
//Write a recursive program to print all the numbers between the range X to Y (X<=Y). Take input of X and Y from the user and print all the integers between the range X to Y using a recursive function.
//
//Input Format
//First line contains an integer X (X>0)
//
//Second line contains an integer Y (Y>0)
//
//Output Format
//Print the numbers between X and Y, each separated by a single space.
//
//Example 1
//Input
//
//5
//8
//Output
//
//5 6 7 8
//Explanation
//
//The numbers between 5 to 8 included are 5,6,7 and 8.
package RecursionInteger;
import java.io.*;
import java.util.*;
public class PrintBetween_X_Y {
        public static void printXY(int x,int y){
            if(x > y){
                return;
            }
            System.out.print(x + " ");
            printXY(x+1,y);


        }
        public static void main(String args[])throws IOException
        {

            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();

            printXY(x,y);


        }
    }

