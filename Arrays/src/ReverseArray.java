public class ReverseArray {
    public static void main(String [] args){
        int array []= {1,2,3,4,5,6};
        int [] reversedArray = reversearray(array);
       for(int num : reversedArray){
           System.out.print(num + " ");
       }
    }


    public static int[] reversearray(int [] array){
        //using extraspace---------------------------
//        int [] ans = new int[array.length];
//        int j= 0;
//        for (int i = array.length-1; i>=0; i--){
//             ans[j++] = array[i];
//        }
//        return ans;



        // without using extra space----------------------
        int start = 0; int last= array.length-1;

        while(start < last){
            int temp = array[last];
            array[last] = array[start];
            array[start]= temp;
            start++;
            last--;
        }
        return  array;
    }
}
