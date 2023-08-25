public class RotateArrayKth {
    public  static void main (String[]args){
        int array [] = {1,2,3,4,5,6,7};
        int k = 2;
        rotate(array,k);
        for(int num :array){
            System.out.print(num + " ");
        }
    }

    public static void reverse(int array[] , int i , int j ){
        int li = i;
        int ri =j;

        while(li < ri){
            int temp = array[li];
            array[li] = array[ri];
            array[ri]= temp;
            li++;
            ri--;
        }
    }

    public static void rotate( int array[], int k){
        k = k% array.length;
        if(k<0){
            k = k+ array.length;
        }
        //rotate part 1
        reverse(array, 0, array.length-k-1);

        // rotate part 2
        reverse(array, array.length-k, array.length-1);

        //rotate whole array
        reverse(array, 0, array.length-1);
    }
}
