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

        // //iterator to traverse the map
        for(Map.Entry <String , Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //removing an element
        map.remove("USA"); // Remove the entry with key "USA"
        System.out.println("Map after removing USA: " + map);
    }
}
