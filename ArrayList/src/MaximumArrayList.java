import java.util.ArrayList;

public class MaximumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(15);
        num.add(3);
        num.add(4);
        num.add(10);

        int max = Integer.MIN_VALUE;
        for(int i =0; i<num.size();i++){
//            if(max < num.get(i)){
//                max = num.get(i);
//            }

            max = Math.max(max, num.get(i));
        }
        System.out.println(max);
    }
}
