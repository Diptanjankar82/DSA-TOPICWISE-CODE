import java.util.*;

//Keys are sorted
//Tc - 0(logn)
public class TreeMap_h {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India" , 700);
        tm.put("bhutan", 7000);
        tm.put("ramnagar", 7000000);

        System.out.println(tm); //oP - {India=700, bhutan=7000, ramnagar=7000000} ordered
    }
}
