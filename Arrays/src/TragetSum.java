import java.util.Scanner;

public class TragetSum {
    public static void main(String [] args) {

            Scanner sc = new Scanner(System.in);

            int target = sc.nextInt();
            int size = sc.nextInt();
            int array[] = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            int ans = Targets(array , target);
            System.out.println(ans);


        }


    private static int Targets(int[] array, int target) {
        int pair = 0;
        for(int i =0; i<array.length; i++){
            for(int j =i+1; j<array.length; j++){
                if(array[i] + array[j] == target){
                    pair++;
                }
            }
        }
        return pair;
    }

}
