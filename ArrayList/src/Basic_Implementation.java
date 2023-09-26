import java.util.*;
public class Basic_Implementation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); //list.add() => addd something after the existing one
        list.add(20);
        list.add(30);
        list.add(59);

        System.out.println(list); //print

        ////////////////////////////////////////////////////////////////////////////
        System.out.println(list.size());//List.size() => it found the length of arraylist

        //////////////////////////////////////////////////////////////////////
        for(int val :list){
            System.out.print(val+" "); //traverse whole arraylist
        }
        ////////////////////////////////////////////////////////////////////////////////
        for(int i =0; i< list.size();i++){
            System.out.println(list.get(i)+ " "); //travese entire arraylist another approach
        }

        list.set(2,300);// list.set() => it replace the value of index
        System.out.println(list);

        //////////////////////////////////////////////////

        list.add(2,500); // list.add() => if here i passed with the index and number it  push the number only
        System.out.println(list);
    }
}
