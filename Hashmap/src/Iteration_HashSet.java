import java.util.*;
public class Iteration_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> cities = new HashSet<>();
        cities.add(4);
        cities.add(5);
        cities.add(6);
        cities.add(7);
        cities.add(8);

//        Iterator it = cities.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        for(Integer it : cities){
            System.out.println(it);
        }
    }
}
