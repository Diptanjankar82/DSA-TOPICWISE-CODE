import java.util.Scanner;

public class MaxOfarray {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int max = MaxArray(array);
        System.out.println(max);

    }

    private static int MaxArray(int[] array) {
        int max = 0;

        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }


        }
        return max;
    }
}
