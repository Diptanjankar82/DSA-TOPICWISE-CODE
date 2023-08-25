import java.util.ArrayList;
import java.util.Arrays;

public class FindAllOccurance {
    public static void main(String[] args) {
        ArrayList <Integer> Occurance = new ArrayList<>();
        int arr[] = {1,2,4,5,2,4,2,8,2};
        int target = 2;
        int n = arr.length;
        int index =0;
      findOccurance(arr, target,n,index,Occurance);
      if(Occurance.isEmpty()){
          System.out.println("no target element");
      }else{
          System.out.println("target element occouance is in these index -" + Occurance );
      }

    }
    public static void findOccurance(int arr[], int target, int n, int index, ArrayList<Integer>Occurance){
        if(index == n){
            return ;
        }
        if(arr[index] == target){
            Occurance.add(index);
        }
        findOccurance(arr,target,n,index+1,Occurance);
    }
}
