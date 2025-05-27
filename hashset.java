import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(1);
        set.add(-5);
        set.add(8);
        set.add(8);
        System.out.println("Set: " + set);
        System.out.println("Set size: " + set.size());
        System.out.println("Set contains 5: " + set.contains(5));

         set.remove(1); // Remove the element 1
        System.out.println("Set after removal: " + set);

        set.clear(); // Clear the Set
        System.out.println("Set after clearing: " + set);
        
        TreeSet<Integer> Seet = new TreeSet<>(set);
        Seet.add(7);
        Seet.add(1);
        Seet.add(-5);
        Seet.add(8);
        Seet.add(8);
        
        System.out.println("TreeSet: " + Seet);
        System.out.println("TreeSet size: " + Seet.size());
        System.out.println("TreeSet contains 5: " + Seet.contains(5));

        Seet.remove(1); // Remove the element 1
        System.out.println("TreeSet after removal: " + Seet);

        Seet.clear(); // Clear the TreeSet
        System.out.println("TreeSet after clearing: " + Seet);

        // Example of using the add method
       
        
    }
    
}
