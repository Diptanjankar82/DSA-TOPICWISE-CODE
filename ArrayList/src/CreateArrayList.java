import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of Element");
        int n = sc.nextInt();

        System.out.println("enter the" + n + " size Element");
        for(int i =0; i<n ; i++){
            int num = sc.nextInt();
            numbers.add(num);

        }
        for(int i =0; i< numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

}
