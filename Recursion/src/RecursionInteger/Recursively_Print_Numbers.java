package RecursionInteger;
import java.util.*;
public class Recursively_Print_Numbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            printtillN(n);

        }

        public static void printtillN(int n) {
            if(n==0){
                return;
            }

            printtillN(n-1);
            System.out.print(n+" ");
        }


    }

