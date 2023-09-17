import java.util.*;


//Sorted Order(ascending)
//Null value are not allowed
//Tc = o(log n)
public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("Noida");
        ts.add("Bangaluru");

        System.out.println(ts);
    }
}
