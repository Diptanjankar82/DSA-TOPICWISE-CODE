package RecursionInteger;
import java.util.Scanner;
public class Recursive_Multiplication {
        public static int multiplyRecursively(int n, int m) {
            //base case
            return ( multiply(n,m));
        }
        public static int multiply(int n , int m){
            if(n<m){
                return multiply(m,n);
            } else if( m!= 0){
                return n + multiply(n, m-1);
            }
            return 0;
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            int product = multiplyRecursively(n, m);
            System.out.println(product);
        }
    }

