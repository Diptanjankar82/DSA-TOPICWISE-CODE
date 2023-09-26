package Recursion_On_String;

import java.util.Scanner;

public class Print_All_Subsequence {
    static void printSubsequence(String s, String currentSubsequence) {
        if (s.isEmpty()) {
            // Base case: When the string is empty, print the current subsequence.
            System.out.print(currentSubsequence + " ");
            return;
        }

        // Include the current character in the subsequence.
        printSubsequence(s.substring(1), currentSubsequence + s.charAt(0));

        // Exclude the current character from the subsequence.
        printSubsequence(s.substring(1), currentSubsequence);
    }

    public static void printAllSubsequences(String s) {
        printSubsequence(s, "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printAllSubsequences(s);
    }

}
