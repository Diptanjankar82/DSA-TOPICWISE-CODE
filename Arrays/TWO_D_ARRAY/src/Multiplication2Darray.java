import java.util.Scanner;

public class Multiplication2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int one[][] = new int[r1][c1];

        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one[0].length; j++) {
                one[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int two[][] = new int[r2][c2];

        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) {
                two[i][j] = sc.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Invalid input: The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        // Product
        int prd[][] = new int[r1][c2];

        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }

        // Print the product matrix
        for (int i = 0; i < prd.length; i++) {
            for (int j = 0; j < prd[0].length; j++) {
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
