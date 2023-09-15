import java.util.*;
public class Linked_HashMap {


    //LinkedHashMap - Keys are insertion ordered
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        hm.put("bhutan", 500);
        hm.put("India",100);
        hm.put("rasia",900);

        System.out.println(hm);
    }
}
