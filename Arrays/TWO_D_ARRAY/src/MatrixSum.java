import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] mat = new int[n][n];

        // Reading the matrix elements from user input
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Calling the alternateMatrixSum method
        alternateMatrixSum(mat, n);
        //System.out.println('\n');
    }

    private static void alternateMatrixSum(int[][] mat, int n) {

        int sum1 = 0;
         int sum2 = 0;

         for(int i =0; i< n; i++){
             for(int j = 0; j<n ;j++){

                 // Checking if the sum of indices is even or odd
                 if((i+j) %2 == 0){
                     // Adding element to sum1 if indices are even
                     sum1+=mat[i][j];
                 }
                 else{
                     sum2 += mat[i][j];
                 }
             }
         }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
