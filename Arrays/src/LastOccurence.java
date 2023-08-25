import java.util.Scanner;

public class LastOccurence {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int ans = Last(array, target);
        System.out.println(ans);

    }

    private static int Last(int[] array, int target) {
        int lastindex =-1;
        for(int i =0; i< array.length; i++){
            if(array[i]==target){
                lastindex = i;
            }
        }
        return lastindex;
    }
}
