import java.util.Scanner;

public class sortedorNot {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        //int target = sc.nextInt();
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        boolean ans = sorted(array);
        System.out.println(ans);

    }

    private static boolean sorted(int[] array) {
        boolean isSortedE = true;
        for(int i  =1; i< array.length; i++){
            if(array[i] <array[i-1]){
                isSortedE = false;
            }
        }
        return isSortedE;
    }
}
