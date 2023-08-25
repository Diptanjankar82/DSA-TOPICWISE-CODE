import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //maxWter(height);
        System.out.println(maxWter(height));
        System.out.println(maxwater(height));
    }
               //BruteForce approach-----------------O(N^2)


    public static int maxWter(ArrayList<Integer>height){
        int max = 0;
        for(int i =0; i< height.size();i++){
            for(int j =i+1; j< height.size();j++){
                int heightofLine = Math.min(height.get(i), height.get(j));
                int weidth = j-i;
                int currrwater = heightofLine * weidth ;
                max = Math.max(max , currrwater);
            }
        }
        return max;
    }


                            //TWO-POINTER APPROACH------- TC- 0(N)
    public static int maxwater( ArrayList<Integer> height){
        int left =0;
        int right = height.size()-1;
        int max = 0;
        while(left < right) {
            int heightofLine = Math.min(height.get(left), height.get(right));
            int weidth = right - left;
            int currrwater = heightofLine * weidth;
            max = Math.max(max, currrwater);


            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
