import java.util.Scanner;

public class PrintLinearlyOnetoNbacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print1toN(n,n);
    }
    static void print1toN(int i, int n){
        if(i <1){
            return;
        }
        print1toN(i-1,n);
        System.out.println(i);
    }

}
