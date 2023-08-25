import java.util.Scanner;

public class PrintNtoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRecursive(n);
    }
    static  void printRecursive(int n){
        if(n < 1){
            return;
        }

        System.out.println(n);
         printRecursive(n-1);
    }
}
