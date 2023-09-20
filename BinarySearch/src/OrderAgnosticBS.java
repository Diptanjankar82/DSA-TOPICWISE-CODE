import java.util.*;
public class OrderAgnosticBS {
    public static void main(String[] args) {
             //int arr []= {1,2,3,4,5,6,7,8,9};
        int arr[] = {9,8,7,6,5,4,3,2,1};
             int target = 6;
             int answer = (OrderAgnoBS(arr,target));
        System.out.println(answer);
    }
    static int OrderAgnoBS (int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        //Find whether the array is sorted in ascending or descending

        boolean isAss = arr[start] < arr[end];

        while(start <= end){
            //find middle of the array
            //int mid = (start + end) / 2 this might be possible some problm  insted of this write == start+ (end - start) /2 ..
            int mid = start + (end -start) /2;

            if(arr[mid] == target) return mid;


            if(isAss){
                if(target < arr[mid]){
                    end = end -1;
                } else {
                    start = mid + 1;
                }


            } else{
                if(target > arr[mid]){
                    end = end -1;
                } else  {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}
