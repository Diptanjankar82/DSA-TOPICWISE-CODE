import java.util.ArrayList;

import java.util.Collections;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println("before Swapping" + num);

        swap(num,1,3);

        System.out.println("After Swapping " + num);
    }

    public static void swap(ArrayList<Integer> list , int index1 ,int index2) {


        //Collections.swap(list, index1, index2);

                 // OR

        int temp = list .get(index1);
        list.set(index1, list.get(index2));
        list.set(index2 , temp);

    }
}
