import java.util.Scanner;
//Find the unique number in a given array where all the element are being repeated twice with one value being unique;


public class ArrayManipulation {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        //int target = sc.nextInt();
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int ans = manipulation(array);
        System.out.println(ans);


    }

    private static int manipulation(int[] array) {
        for (int i =0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                if(array [i] == array[j]){
                    array[i] = -1;
                    array[j] = -1;

                }
            }
        }
        int ans = -1;
        for(int i =0; i<array.length; i++){
            if(array[i] > 0){
                ans = array[i];
            }
        }
        return ans;
    }
}
