package Recursion_On_Array;
import java.util.*;
public class Array {
        static int array11(int[] nums, int index) {
            //Write your code here
//            int count =0;
//            for(int i =0; i<nums.length;i++){
//                if(nums[i] == 11){
//                    count++;
//                }
//            }
//            return count;
            //base case
            if(index == nums.length){
                return 0;
            }else if(nums[index] == 11){
                return 1+ array11(nums, index+1);
            }else{
                return array11(nums, index+1);
            }

              //recursive call

        }

        public static void main(String[] args) throws Throwable {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(array11(arr, 0));
        }
    }

