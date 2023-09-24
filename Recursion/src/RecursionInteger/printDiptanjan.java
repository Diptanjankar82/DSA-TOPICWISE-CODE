package RecursionInteger;
import java.io.*;
import java.util.*;
public class printDiptanjan {

        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);

            int n=sc.nextInt();

            solve(n);

        }

        public static void solve(int n)
        {
          if(n==0){
              return;
          }
            System.out.println("Diptanjan");

          solve(n-1);
        }
    }

