import java.util.Scanner;

public class CountOccurence {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int ans = Count(array, target);
        System.out.println(ans);

    }

    private static int Count(int[] array, int target) {
        int count = 0;
        for(int i=0; i< array.length; i++){
            if(array[i] == target){
                count++;
            }
        }
        return count;
    }
}
