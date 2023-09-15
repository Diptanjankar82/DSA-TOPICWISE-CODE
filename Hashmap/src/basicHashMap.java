import java.util.HashMap;

public class basicHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //INSERT -0(1)
        hm.put("bhutan", 7);
        hm.put("India", 5);

        System.out.println(hm);

        //Get - 0(1);
        int population = hm.get("India");
        System.out.println(population);

        //Contains - 0(1)

        System.out.println(hm.containsKey("India")); // True or False

        //Remove - 0(1)
        System.out.println(hm.remove("India"));

        //Size -
        System.out.println(hm.size());

        //isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
