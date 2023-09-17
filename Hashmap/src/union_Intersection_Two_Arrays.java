import java.util.*;
public class union_Intersection_Two_Arrays {
    public static void main(String[] args) {
        int arr1 []= {7,3,9};
        int arr2 [] = {6,3,9,2,9,4};
      int result[] =  union(arr1,arr2);
//        for(int i =0; i<result.length;i++){
//            System.out.println(result[i]);
//        }
        System.out.println(result.length);

        int instres =  intersection(arr1,arr2);
        System.out.println(instres);

    }

    public static int[] union(int arr1[],int arr2[]){// 6,3,9,2,4

        Set<Integer> res = new HashSet<>();
        for(int i =0; i<arr1.length;i++){
            res.add(arr1[i]);
        }

        for(int j =0; j<arr2.length;j++){
            res.add(arr2[j]);
        }
        int resultArray [] = new int[res.size()];
        int k =0;
        for (Integer num:
             res) {
            resultArray[k++] = num;
        }
        return resultArray;
    }

    public static int intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (Integer num:arr1
             ) {
            set.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num: arr2
             ) {
            if(set.contains(num)){
                result.add(num);
                set.remove(num);
            }
        }
        int finalresult = result.size();
        return finalresult;
    }

}

