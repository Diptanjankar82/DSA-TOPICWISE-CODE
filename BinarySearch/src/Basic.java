import java.util.*;
public class Basic {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int target = 2;

       int answer = binarySearch(arr,target);
        System.out.println(answer);

    }

    static int binarySearch (int arr[] , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find middle of the array
            //int mid = (start + end) / 2 this might be possible some problm  insted of this write == start+ (end - start) /2 ..
           int mid = start + (end -start) /2;

           if(target < arr[mid]){
               end = end -1;
           } else if (target > arr[mid]) {
               start = mid + 1;
           } else {
               return mid;
           }
        }
        return -1;
    }
}
