import java.util.Scanner;

public class SecondLargest {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        //int target = sc.nextInt();
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int ans = findSecondLargest(array);
        System.out.println(ans);


    }

    public static int findmax(int []array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int findSecondLargest(int[] array) {
        int mx = findmax(array);

        for(int i =0; i< array.length; i++){
            if(array[i] == mx){
                array[i] = Integer.MIN_VALUE;

            }
        }
        int SecondMax = findmax(array);
        return SecondMax;

            }
        }



