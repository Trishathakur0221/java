import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("USA", 130);
        map.put("China", 150);
        map.put("Brazil", 110);

        System.out.println("Map: " + map);

        // searching for an element
        if(map.containsKey("UA")) {
            System.out.println("UA is present in the map.");
        } else {
            System.out.println("UA is not present in the map.");
        }

        //get the value associated with a key
        System.out.println("Value associated with 'US': " + map.get("US"));        
        System.out.println("Value associated with 'India': " + map.get("India"));
    }
}
