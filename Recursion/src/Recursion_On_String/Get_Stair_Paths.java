//Get Stair Paths
//You are given a number n representing the number of stairs in a staircase. You are standing on the floor. In one step you can jump 1 stair, 2 stairs, or 3 stairs.
//
//Return the list of all paths that can be used to climb up the staircase. See examples for more clarity regarding output.
//
//Note: Write the code recursively. The purpose is to learn recursion and not just solve the problem.
//
//Input Format
//First line of input contains a single integer n.
//
//Output Format
//Return the list of all paths that can be used to climb up the staircase.
//
//Example 1
//Input
//
//3
//Output
//
//[111, 12, 21, 3]
//Explanation
//
//You can climb the stairs in 4 ways.
//
//111 -> climb up one step, then one step, and then again one step.
//
//12 -> climb up 1 step and then 2 steps.
//
//21 -> climb up 2 steps and then 1 step.
//
//3 -> climb up 3 steps.
//
//Example 2
//Input
//
//2
//Output
//
//[11, 2]
//Explanation
//
//You can climb up this in 2 ways.
//
//Constraints
//1 <= n <= 10

package Recursion_On_String;
import java.io.*;
import java.util.*;
public class Get_Stair_Paths {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        //Base case

        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        //Recursive call

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }
        for (String path : paths3) {
            paths.add(3 + path);
        }
        return paths;
    }

}


    //to solve without ArrayList Return


    //   public class Get_Stair_Paths {
//        static void printStairPaths(int n, String pathSoFar) {
//            // Base case: if n is 0, print the path
//            if (n == 0) {
//                System.out.println(pathSoFar);
//                return;
//            }

//            if(n < 0){
//              return;
//          }
//
//
//            // Recursive cases for 1 step, 2 steps, and 3 steps
//
//                printStairPaths(n - 1, pathSoFar + "1");
//
//
//                printStairPaths(n - 2, pathSoFar + "2");
//
//
//                printStairPaths(n - 3, pathSoFar + "3");
//
//        }
//
//        public static void main(String[] args) throws Exception {
//            Scanner sc = new Scanner(System.in);
//            int n;
//            n = sc.nextInt();
//            printStairPaths(n, "");
//        }
//    }
//
//}