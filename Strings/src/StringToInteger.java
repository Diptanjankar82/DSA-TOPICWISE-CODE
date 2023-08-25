import java.util.ArrayList;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "1321,3213,424,124";
        String nums[] = str.split(",");
        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0; i <nums.length; i++){
            String num = nums[i].trim();
            result.add(Integer.parseInt(num));
        }
        System.out.println(result);

    }
}
