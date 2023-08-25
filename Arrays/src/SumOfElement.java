import java.util.Scanner;

public class SumOfElement {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = sumArray(array);
        System.out.println(sum);

    }
    private static int sumArray(int [] array) {
        int sum =0;
        for(int i =0; i< array.length; i++){
            sum+=array[i];
        }
        return sum;

    }
}
