import java.util.*;
public class Hashset2 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet <>();

        //insert elements
        set.add(7);
        set.add(1);
        set.add(-5);
        set.add(8);
        set.add(8); // Duplicate element, will not be added again

        System.out.println("Set: " + set);
        System.out.println("Set size: " + set.size());
        
        //searching for an element
        if(set.contains(9)){
            System.out.println("Element found in the set.");
        } else {
            System.out.println("Element not found in the set.");
        }

        //removing an element
        set.remove(1); // Remove the element 1
        System.out.println("Set after removing 1: " + set);
    }
}
