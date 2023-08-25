import java.util.Scanner;

public class SearchInArray {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int size = sc.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int ans = Search(array, target);
        System.out.println(ans);

    }

    private static int Search(int[] array, int target) {
        int ans = -1;

        for(int i =0; i< array.length; i++){
            if(array[i] == target ){
                ans = i;
                break; // for found 1st occurance we add break; then when we found our target we just return and end of program
            }
        }
        return ans;
    }
}
