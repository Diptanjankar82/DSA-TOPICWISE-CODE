import java.util.*;
public class Iteration_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("rasia", 200);
        hm.put("bhutan",500);


        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k:keys
             ) {
            System.out.println("key=" + k + ", value="+hm.get(k));
        }

    }
}
