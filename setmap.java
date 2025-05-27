import java.util.HashMap;

public class setmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 2);
        map.put("id2", 3);
        /*
         * for (String key : map.keySet()) {
         * System.out.println(key + " : " + map.get(key));
         * }
         * for (Integer value : map.values()) {
         * System.out.println(value);
         * }
         */
        System.out.println(map.get("id1"));
        System.out.println(map.get("id9"));
        System.out.println(map.containsKey("id9"));
        System.out.println(map.containsKey("id2"));

        if (map.containsKey("id1")) {
            System.out.println("Key id2 exists in the map.");
        } else {
            System.out.println("Key id2 does not exist in the map.");
        }
        System.out.println(map.remove("id1"));

        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }

}
