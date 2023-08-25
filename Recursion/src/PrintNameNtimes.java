import java.util.Scanner;

public class PrintNameNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        printNum(1, n);

    }

    private static void printNum(int i, int n) {
        if(i > n){
            return;
        }
        System.out.println("dip");
        printNum(i+1, n);
    }
}
