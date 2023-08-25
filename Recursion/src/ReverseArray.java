import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr []= {1,7,9,4,5};
        reverseArray(arr,0);
        System.out.println(Arrays.toString(arr));    }

                       // TWO - POINTER

//    public static void reverseArray(int arr[], int start, int end){
//         if(start >= end){
//             return;
//         }
//
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//
//         reverseArray(arr, start+1,end-1);
//    }


                 //ONE - POINTER
    public static void reverseArray(int arr[] , int start){
        if(start >= arr.length/2){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[arr.length-start-1];
        arr[arr.length-start-1] = temp;

        reverseArray(arr, start+1);
    }
}
